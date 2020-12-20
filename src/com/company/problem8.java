package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("b");
        myArrayList.add("c");
        myArrayList.add("a");

        System.out.println(myArrayList);
        Collections.sort(myArrayList);
        System.out.println(myArrayList);
    }
}