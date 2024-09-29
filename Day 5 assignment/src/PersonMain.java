import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Enter your  first name: ");
        person.setFirstName(sc.next());
        System.out.println("Enter your  last name: ");
        person.setLastName(sc.next());
        System.out.println("Enter date of birth in yyyy/MM/dd format: ");
        String dobInput = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dob = LocalDate.parse(dobInput, formatter);
        person.setDob(dob);
        person.DisplayDetails();
    }
}
