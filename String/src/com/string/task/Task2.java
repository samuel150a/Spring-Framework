package com.string.task;

public class Task2 {
    public static void main(String[] args) {
        String sentence = "I am learning Java programming";
        String[] words = sentence.split(" ");
        int count = words.length;
        System.out.println("Number of words: " + count);
    }
}
