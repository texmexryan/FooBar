package com.example.demo;

public class BStrategy implements Strategy{



    public String result="";

    @Override
    public String calculate(int val) {

        if(val % 3 == 0){
            return result+="Foo";
        }
        return "";
    }
}