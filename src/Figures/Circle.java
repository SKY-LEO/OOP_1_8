package Figures;

public class Circle extends Shape {
    int x_center;
    int y_center;

    public Circle() {

    }

    public Circle(String color, int x_center, int y_center) {
        super(color);
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public int getY_center() {
        return y_center;
    }

    public void setY_center(int y_center) {
        this.y_center = y_center;
    }

    public int getX_center() {
        return x_center;
    }

    public void setX_center(int x_center) {
        this.x_center = x_center;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CIRCLE:\n" + "color: " + this.color + "\nx_center: " + this.x_center + "\ny_center: " + this.y_center;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Circle circle = (Circle) object;
        if (this.x_center != circle.x_center) return false;
        return this.y_center == circle.y_center;
    }
}
