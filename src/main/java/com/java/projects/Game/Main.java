package com.java.projects.Game;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameLevel gameLevel = new GameLevel();

        System.out.println("Get name level:");
        gameLevel.setName(scanner.nextLine());

        System.out.println("Get number of monsters:");
        gameLevel.setNumberOfMonsters(Integer.parseInt(scanner.nextLine()));

        System.out.println("Get difficulty level:");
        for (DifficultyLevel element : DifficultyLevel.values()){
            System.out.println(element + " level: " + element.getLevel());
        }
        String level = scanner.nextLine();
        DifficultyLevel difficultyLevel = DifficultyLevel.valueOf(level);
        gameLevel.setDifficultLevel(difficultyLevel);

        System.out.println("Get time limit of level:");
        gameLevel.setLenghtOfLevel(Integer.parseInt(scanner.nextLine()));

        System.out.println("Get points to win:");
        gameLevel.setPoints(Integer.parseInt(scanner.nextLine()));

        System.out.println(gameLevel);
    }
}
