package com.company;

public class Main {
    public static boolean isPalindromLight (String text){
        StringBuilder builder = new StringBuilder(text);
        String reverse  = builder.reverse().toString();
        boolean result = true;
        if (text.equals(reverse)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
    public static boolean isPalindromRefactured (String text){
        StringBuilder builder = new StringBuilder(text);
        String reverse  = builder.reverse().toString();
        boolean result = (text.equals(reverse)) ? true : false;
        return result;
    }
    public static void main(String[] args) {
        String text = "222";
        System.out.println(isPalindromLight(text));
    }
}
