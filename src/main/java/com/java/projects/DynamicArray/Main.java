package com.java.projects.DynamicArray;

import java.util.Scanner;

/**
 * Create dynamic array.
 */

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        Scanner scanner = new Scanner(System.in);
        int line;

//        add to table until write 0
        do {
            line = scanner.nextInt();
            dynamicArray.addElement(line);
        } while (line != 0);
        System.out.println(dynamicArray);
    }
}
