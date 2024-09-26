import java.util.Scanner;
public class ProductClassMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        productClass[] products1=new productClass[5];
        for (int i = 0; i < products1.length; i++) {
            System.out.println("Enter product"+i+" id");
            int id=sc.nextInt();
            System.out.println("Enter Product"+i+" name" );
            String name=sc.next();
            System.out.println("Enter Product"+i+" price");
            double price=sc.nextDouble();
            products1[i]=new productClass(id,name,price);
        }
        for (int i = 0; i < products1.length; i++) {
            products1[i].Display();
        }
    }
}
