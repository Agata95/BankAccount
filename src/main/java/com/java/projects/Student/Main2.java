package com.java.projects.Student;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write name:");
        String name = scanner.next();
        System.out.println("Write surname:");
        String surname = scanner.next();
        System.out.println("Write index:");
        String index = scanner.next();
        System.out.println("Write gender:");
        String gender = scanner.next();

        Student student = new Student(name, surname, index, gender);
    }
}
