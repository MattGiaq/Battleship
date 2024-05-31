package Grid;

public class Cell {
    private boolean isOccupied;
    private boolean isHit;

    //Constructor
    public Cell() {
        isOccupied = false;
        isHit = false;
    }

    //Getters and setters
    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isHit() {
        return isHit;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }
}
