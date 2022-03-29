package com.java.projects.Game;

public class GameLevel {
    private String name;
    private int numberOfMonsters;
    private DifficultyLevel difficultyLevel;
    private int lenghtOfLevel;
    private int points;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMonsters() {
        return numberOfMonsters;
    }

    public void setNumberOfMonsters(int numberOfMonsters) {
        this.numberOfMonsters = numberOfMonsters;
    }

    public DifficultyLevel getDifficultLevel() {
        return difficultyLevel;
    }

    public void setDifficultLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getLenghtOfLevel() {
        return lenghtOfLevel;
    }

    public void setLenghtOfLevel(int lenghtOfLevel) {
        this.lenghtOfLevel = lenghtOfLevel;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public GameLevel(String name, int numberOfMonsters, DifficultyLevel difficultyLevel, int lenghtOfLevel, int points) {
        this.name = name;
        this.numberOfMonsters = numberOfMonsters;
        this.difficultyLevel = difficultyLevel;
        this.lenghtOfLevel = lenghtOfLevel;
        this.points = points;
    }

    public GameLevel() {
    }

    @Override
    public String toString() {
        return "GameLevel{" +
                "name='" + name + '\'' +
                ", numberOfMonsters=" + numberOfMonsters +
                ", difficultyLevel=" + difficultyLevel +
                ", lenghtOfLevel=" + lenghtOfLevel +
                ", points=" + points +
                '}';
    }
}
