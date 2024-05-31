package com.example.finalproject;

import java.util.List;

public class Ship {
    private List<Cell> position;
    private boolean isDestroyed;

    public Ship(List<Cell> position) {
        this.position = position;
        isDestroyed = false;
    }

    // Other methods to manage the ship state...
}