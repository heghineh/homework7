package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class problem9 {
    public static void main(String[] args) {

        ArrayList<String> first = new ArrayList<>();
        first.add("a");
        first.add("b");
        first.add("c");

        ArrayList<String> second = new ArrayList<>();
        second.add("");
        second.add("");
        second.add("");

        System.out.println(first + "\t" + second);
        Collections.copy(second, first);
        System.out.println(first + "\t" + second);
    }
}