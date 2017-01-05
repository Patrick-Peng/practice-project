package com.project.dao;

public class Test {
    public static void main(String[] args) {
        String numberString = "122";
        numberString = numberString.replaceAll("\\.", "");
        numberString = numberString.replaceAll("\\,", ".");
        System.out.println(numberString);
    }
}
