package com.java.projects.Game;

public enum DifficultLevel {
    LOW(1),
    SEMI_MEDIUM(2),
    MEDIUM(3),
    SEMI_PRO(4),
    PRO(5),
    ADVANCED(6),
    CHUCK_NORRIS(69);

    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    DifficultLevel(int level) {
        this.level = level;
    }
}
