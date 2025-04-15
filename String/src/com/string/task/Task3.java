package com.string.task;

public class Task3 {
    public static void main(String[] args) {
        String sentence = "I am learning Java";
        String target = "Java";

        String[] words = sentence.split(" ");
        boolean found = false;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                found = true;
            }
        }

        if (found) {
            System.out.println("Word present");
        } else {
            System.out.println("Word not present");
        }
    }
}
