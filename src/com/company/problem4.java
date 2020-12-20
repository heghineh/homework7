package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");

        System.out.println(myArrayList.get(index));
    }
}