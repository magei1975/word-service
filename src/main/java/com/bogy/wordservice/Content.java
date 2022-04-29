package com.bogy.wordservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Content {
    private List<String> words = new ArrayList<>();
    private int random = 0;

    public List<String> getWords() {
        return words;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }
}
