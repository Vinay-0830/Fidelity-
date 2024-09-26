import java.util.Scanner;
public class ParkingLot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Vehicle Registration Number: ");
        String regNum = sc.nextLine();
        System.out.println("Enter the Vehicle Brand: ");
        String brand = sc.nextLine();
        System.out.println("Enter the Vehicle Type: ");
        System.out.println("Select 1.Car 2.Motorcycle");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter the number of doors: ");
                int doors = sc.nextInt();
                Vehicle car=new Car(regNum,brand,doors);
                car.CalculateParkingFee();
                car.Display();
                break;
                case 2:
                    System.out.println("Enter the Engine Type: ");
                    String engine = sc.nextLine();
                    Vehicle motorcycle=new Motorcycle(regNum,brand,engine);
                    motorcycle.CalculateParkingFee();
                    motorcycle.Display();
                    break;
        }
    }


}
