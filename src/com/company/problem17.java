package com.company;

import java.util.ArrayList;

public class problem17 {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");

        System.out.println(myArrayList);
        myArrayList.set(2, "element");
        System.out.println(myArrayList);
    }
}