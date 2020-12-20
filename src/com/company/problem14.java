package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class problem14 {
    public static void main(String[] args) {

        ArrayList<String> first = new ArrayList<>();
        first.add("a");
        first.add("b");
        first.add("c");

        ArrayList<String> second = new ArrayList<>();
        second.add("d");
        second.add("e");
        second.add("f");

        System.out.println(first + "\t" + second);
        first.addAll(second);
        System.out.println(first);
    }
}