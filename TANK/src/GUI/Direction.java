package GUI;

public enum Direction {
    LEFT(-10, 0), RIGHT(10, 0), UP(0, -10), DOWN(0, 10);

    private int deltaX = 0, deltaY = 0;

    private Direction(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public int getDeltaY() {
        return deltaY;
    }

    public void setDeltaY(int deltaY) {
        this.deltaY = deltaY;
    }

    public int getDeltaX() {
        return deltaX;
    }

    public void setDeltaX(int deltaX) {
        this.deltaX = deltaX;
    }
    
}
