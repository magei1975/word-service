package com.bogy.wordservice.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WordResourceTest {

    @Autowired
    private WordResource wordResource;

    @Test
    void testGetWord() {
        Assertions.assertThat(wordResource.getWords()).isEqualTo(Arrays.asList("Hallo", "Bogy"));
    }

}