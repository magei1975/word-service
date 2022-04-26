package com.bogy.wordservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class WordResource {

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/words")
    List<String> getWords() {
        return Arrays.asList("Hallo", "Bogy");
    }

}
