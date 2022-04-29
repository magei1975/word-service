package com.bogy.wordservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class WordResource {

    @GetMapping("/words")
    @CrossOrigin(origins = "http://localhost:8080")
    List<String> getWords() {
        return Arrays.asList("Hallo", "Bogy");
    }

}
