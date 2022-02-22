package Figures;

public class Rectangle extends Shape {
    int x_top_left;
    int y_top_left;
    int width;
    int height;

    public Rectangle() {

    }

    public Rectangle(String color, int x_top_left, int y_top_left, int width, int height) {
        super(color);
        this.x_top_left = x_top_left;
        this.y_top_left = y_top_left;
        this.width = width;
        this.height = height;
    }

    public int getX_top_left() {
        return x_top_left;
    }

    public void setX_top_left(int x_top_left) {
        this.x_top_left = x_top_left;
    }

    public int getY_top_left() {
        return y_top_left;
    }

    public void setY_top_left(int y_top_left) {
        this.y_top_left = y_top_left;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "RECTANGLE:\n" + "color: " + this.color + "\nx_top_left: " + this.x_top_left + "\ny_top_left: " + this.y_top_left
                + "\nwidth: " + this.width + "\nheight: " + this.height;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        if (this.x_top_left != rectangle.x_top_left) return false;
        if (this.y_top_left != rectangle.y_top_left) return false;
        if (this.width != rectangle.width) return false;
        return this.height == rectangle.height;
    }
}
