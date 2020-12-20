package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");
        myArrayList.add("d");

        System.out.println(myArrayList);
        myArrayList.remove(3);
        System.out.println(myArrayList);
    }
}