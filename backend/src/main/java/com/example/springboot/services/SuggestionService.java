package com.example.springboot.services;

import java.util.List;

public interface SuggestionService {
    public List<String> getSuggestions(String searchText);
}
