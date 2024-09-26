public class CalculateArea {
    public double calculate(double side) {
        return side * side;
    }
    public double calculate(double length,double width) {
        return length * width;
    }
    public double calculate(double radius,Boolean isCircle) {
        return 3.14*radius*radius;
    }
}

