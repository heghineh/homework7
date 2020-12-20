package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class problem11 {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");

        System.out.println(myArrayList);
        Collections.reverse(myArrayList);
        System.out.println(myArrayList);
    }
}