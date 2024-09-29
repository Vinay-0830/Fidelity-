import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public LocalDate getDob() {return dob;}
    public void setDob(LocalDate dob) {this.dob = dob;}

    public String getAdult(){
        int age =GetAge(dob);
        return (age>=18)?"Adult":"Child";
    }
    public int GetAge(LocalDate dob){
        LocalDate today = LocalDate.now();
        if(dob !=null){
            return Period.between(dob,today).getYears();
        }
        else {
            return 0;
        }
    }
    public void DisplayDetails(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + GetAge(dob));
        System.out.println("getAdult()");
    }
}
