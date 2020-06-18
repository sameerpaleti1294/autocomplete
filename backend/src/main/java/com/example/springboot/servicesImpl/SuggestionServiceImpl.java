package com.example.springboot.servicesImpl;

import com.example.springboot.services.SuggestionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SuggestionServiceImpl implements SuggestionService {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Override
    public List<String> getSuggestions(String searchText) {
        if (searchText == null || searchText.trim().isEmpty()) {
            return Collections.emptyList();
        }
        Resource resource = new ClassPathResource("data.txt");
        List<String> list = new ArrayList<>();

        try {
            InputStream inputStream = resource.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()) {
                String line = reader.readLine();
                list.add(line);
            }
        } catch (IOException e) {
            LOGGER.error("IOException", e);
        }
        return list.stream().filter(s -> s.toLowerCase().startsWith(searchText.toLowerCase())).collect(Collectors.toList());
    }
}
