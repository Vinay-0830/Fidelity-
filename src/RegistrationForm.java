public class RegistrationForm {
    String name;
    int age;
    String country;
    RegistrationForm(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
    void display() {
        System.out.println("Welcome " + name+".Your age is "+age+"and you are from"+country);
    }

}
