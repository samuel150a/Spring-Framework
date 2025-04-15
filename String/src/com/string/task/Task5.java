package com.string.task;

public class Task5 {
    public static void main(String[] args) {
        String sentence = "Hello, how are you?";
        int spaceCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Number of spaces: " + spaceCount);
    }
}

