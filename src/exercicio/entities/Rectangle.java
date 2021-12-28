package exercicio.entities;

public class Rectangle {
    public double width;
    public double heith;

    public double area() {
        return width * heith;
    }

    public double perimeter() {
        return 2 * (width * heith);
    }

    public double diagonal() {
        return Math.sqrt(width * width + heith * heith);
    }
}
