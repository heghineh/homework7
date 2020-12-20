package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");

        System.out.println(myArrayList);
        System.out.print("Enter the element to find the index: ");
        String element = scanner.nextLine();
        System.out.println("Index is " + myArrayList.indexOf(element));
    }
}