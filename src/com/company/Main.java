package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(withoutString("Hello there", "llo"));
        System.out.println(withoutString("Hello there", "e"));
        System.out.println(withoutString("Hello there", "x"));
    }
    public static String withoutString(String base, String remove) {
        return base.replaceAll(remove, "");
    }
}
