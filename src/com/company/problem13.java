package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class problem13 {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");

        System.out.println(myArrayList);
        Collections.swap(myArrayList, 0, 2);
        System.out.println(myArrayList);
    }
}