package Challenge;

public class Rovers {
    private String compassDirection;
    private int xPosition;
    private int yPosition;

    public Rovers(int yPosition,int xPosition, String compassDirection) {
        this.yPosition = yPosition;
        this.xPosition = xPosition;
        this.compassDirection = compassDirection;
    }

    public String getCompassDirection() {
        return compassDirection;
    }

    public void setCompassDirection(String compassDirection) {
        this.compassDirection = compassDirection;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    @Override
    public String toString() {
        return "(" + this.getxPosition() + ", " + this.getyPosition() + ", " + this.getCompassDirection() + ")";
    }
}
