package com.example.demo;

public class Application {
    public static void main(String[] args) {

        int val =33;

        Strategy getOutput = new FStrategy();
        System.out.println(getOutput.calculate(val));

    }
}