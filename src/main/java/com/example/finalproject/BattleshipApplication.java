package com.example.finalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Grid.Grid;
import Grid.Cell;

@SpringBootApplication
public class BattleshipApplication {

	public static void main(String[] args) {
		// Creation of an instance of grid class
		Grid grid = new Grid(10, 10);

		// Set some cells as occupied and hit for test purposes
		grid.getCell(1, 1).setOccupied(true);
		grid.getCell(2, 2).setOccupied(true);
		grid.getCell(3, 3).setOccupied(true);
		grid.getCell(1, 1).setHit(true);
		grid.getCell(2, 2).setHit(true);

		// Print the grid
		System.out.println("Grid:");
		grid.printGrid();

		// Spring Boot application startup
		SpringApplication.run(BattleshipApplication.class, args);
	}
}
