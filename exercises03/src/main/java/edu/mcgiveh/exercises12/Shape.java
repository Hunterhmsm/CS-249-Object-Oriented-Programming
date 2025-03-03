package edu.mcgiveh.exercises12;
import edu.mcgiveh.math.Point2D;


public class Shape {
    private boolean filled;
    private Point2D center = new Point2D(0,0);

    public Shape() {}

    public Shape(Point2D center) {
        this.center = new Point2D(center);
    }

    public Shape(Point2D center, boolean filled) {
        this(center);
        this.filled = filled;
    }

    public boolean isFilled() { return filled; }
    public void setFilled(boolean f) { filled = f; }

    public Point2D getCenter() {
        return new Point2D(center);
    }

    public void setCenter(Point2D center) {
        this.center = new Point2D(center);
    }

    public String toString() {
        String s = "";
        s += "SHAPE\n";
        s += "* Center: " + center + "\n";
        s += "* Filled?: " + filled + "\n";
        return s;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Shape so) {
            if(filled == so.filled && center.equals(so.center)){
                return true;
            }
        }
        return false;
    }
}
