package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");

        System.out.println(myArrayList);
        System.out.print("Enter the index to update the element: ");
        int index = scanner.nextInt();
        myArrayList.set(index, "element");
        System.out.println(myArrayList);
    }
}