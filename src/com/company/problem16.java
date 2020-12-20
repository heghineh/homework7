package com.company;

import java.util.ArrayList;

public class problem16 {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");

        if (!myArrayList.isEmpty())
            System.out.println("The array list isn't empty.");
        else
            System.out.println("The array list is empty.");
    }
}