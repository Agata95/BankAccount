package com.java.projects.DynamicArray;

import java.util.Arrays;

public class DynamicArray {
    private int[] table;
    private int numberOfElements;

    public DynamicArray() {
        this.table = new int[10];
        this.numberOfElements = 0;
    }

    public void addElement(int element) {
        if (!enoughSpace()) {
            extendArrayTwice();
        }

        table[numberOfElements] = element;
        numberOfElements++;
    }

    private void extendArrayTwice() {
        int[] newTable = new int[table.length * 2];
        for (int i = 0; i < table.length; i++) {
            newTable[i] = table[i];
        }
        table = newTable;
    }

    private boolean enoughSpace() {
        return numberOfElements < table.length;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "table=" + Arrays.toString(table) +
                ", numberOfElements=" + numberOfElements +
                '}';
    }
}
