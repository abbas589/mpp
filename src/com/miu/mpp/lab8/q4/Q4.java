package com.miu.mpp.lab8.q4;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author bazz
 * Jan 31 2023
 * 23:54
 */
public class Q4 {


    public int countWords(List<String> words, char c, char d, int len) {

        return (int) words.stream()
                .filter(word -> word.contains(String.valueOf(c)))
                .filter(word -> !word.contains(String.valueOf(d)))
                .filter(word -> word.length() == len)
                .count();
    }
}
