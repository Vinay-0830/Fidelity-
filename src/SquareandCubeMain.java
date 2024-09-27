import java.util.Scanner;
public class SquareandCubeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        double a = sc.nextDouble();
        SquareandCube square = new SquareandCube();
        System.out.println("The square of "+a+" is : "+square.FindSquare(a));
        System.out.println("The cube of "+a+" is : "+square.FindCube(a));
    }
}
