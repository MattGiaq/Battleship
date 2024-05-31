package Grid;

public class Grid {
    private int rows;
    private int cols;
    private Cell[][] cells;

    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        cells = new Cell[rows][cols];

        // Initialize all the cells as empty
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    // Getter for rows and cols
    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    // Getter and setter for cells
    public Cell getCell(int row, int col) {
        return cells[row][col];
    }

    public void setCell(int row, int col, Cell cell) {
        cells[row][col] = cell;
    }

    // Method to print the grid
    public void printGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (cells[i][j].isOccupied()) {
                    System.out.print("X "); // Cell is occupied
                } else if (cells[i][j].isHit()) {
                    System.out.print("* "); // Cell is hit
                } else {
                    System.out.print("- "); // Cell is not occupied or hit
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}

