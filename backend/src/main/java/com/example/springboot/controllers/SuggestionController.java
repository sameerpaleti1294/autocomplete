package com.example.springboot.controllers;

import com.example.springboot.services.SuggestionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SuggestionController {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    private SuggestionService suggestionService;

    @CrossOrigin
    @GetMapping("/suggestions")
    public List<String> suggestions(@RequestParam String searchText) {
        return this.suggestionService.getSuggestions(searchText);
    }

}
