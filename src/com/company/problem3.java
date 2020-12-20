package com.company;

import java.util.ArrayList;

public class problem3 {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");

        System.out.println(myArrayList);
        myArrayList.add(0, "element");
        System.out.println(myArrayList);
    }
}