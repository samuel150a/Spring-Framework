package com.abstrat.runner;


import com.abstrat.internal.*;

public class Run {
    public static void main(String[] args) {
        Think think= new Think();
        think.thinking();

        Triangle triangle=new Triangle();
        triangle.design();

        Work work =new Work();
        work.working();

        Joke joke=new Joke();
        joke.joking();

        Innovate innovate=new Innovate();
        innovate.innovating();

    }
}