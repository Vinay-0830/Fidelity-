public class CalculateAreaMain {
    public static void main(String[] args) {
        CalculateArea calc = new CalculateArea();
        double squareArea=calc.calculate(5.0);
        System.out.println("The area of the square is: "+squareArea);

        double rectangleArea=calc.calculate(4.0,6.0);
        System.out.println("The area of the rectangle is: "+rectangleArea);

        double circleArea=calc.calculate(3.0,Boolean.TRUE);

    }
}
