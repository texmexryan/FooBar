package com.example.demo;

public class QStrategy implements Strategy {

    public String result="";


    @Override
    public String calculate(int val) {

        if(val % 7 == 0){

            return result+= "Qix";

        }

        return "";
    }
}