public class FanSpeeds {
    // Create constants for fan speed
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Create private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-arg default values
    public FanSpeeds() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    // Create getters
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Create setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        if (on) {
            return "Fan is on: speed = " + speed + ", color = " + color + ", radius = " + radius;
        } else {
            return "Fan is off: color = " + color + ", radius = " + radius;
        }
    }
}