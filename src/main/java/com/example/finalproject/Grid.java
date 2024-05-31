package com.example.finalproject;

public class Grid {
    private Cell[][] cells;

    public Grid(int size) {
        cells = new Cell[size][size];
        // Initialize all cells as empty
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    // Other methods to manage the game grid...
}

