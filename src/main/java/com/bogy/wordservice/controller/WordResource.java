package com.bogy.wordservice.controller;

import com.bogy.wordservice.Content;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class WordResource {

    @GetMapping("/content")
    @CrossOrigin(origins = "http://ip172-18-0-48-c9lniqs33d5g008fq8f0-8080.direct.labs.play-with-docker.com/")
    Content getContent() {
        Content content = new Content();
        content.setWords(Arrays.asList("Hallo", "Bogy"));
        content.setRandom(new Random().nextInt(2) + 1);
        return content;
//        return Arrays.asList("Hallo", "Bogy");
    }

}
