package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class problem15 {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");

        System.out.println("Before: " + myArrayList.size());
        myArrayList.clear();
        System.out.println("After: " + myArrayList.size());
    }
}