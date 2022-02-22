package Figures;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Black", 45, 0);
        shapes[1] = new Circle("Black", 45, 0);
        shapes[2] = new Rectangle("Green", 20, -10, 60, 30);
        for(Shape shape:shapes){
            System.out.println(shape);
        }
        System.out.println(shapes[0].equals(shapes[1]));
    }
}
