package com.company;

import java.util.ArrayList;

public class problem2 {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("first");
        myArrayList.add("second");
        myArrayList.add("third");

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }
}