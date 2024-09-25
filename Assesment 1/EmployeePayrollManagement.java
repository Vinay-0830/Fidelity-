public class EmployeePayrollManagement {
    public static void main(String[] args) {

        PermanentEmployee emp1 = new PermanentEmployee();
        emp1.initialize(101,"Esther",25000,1500);
        System.out.println("Details for Permanent Employee:");
        emp1.DisplayDetails();

        System.out.println();

        TemporaryEmployee emp2 = new TemporaryEmployee();
        emp2.initialize(102,"Ganesh",1500,20);
        System.out.println("Details for Temporary Employee:");
        emp2.DisplayDetails();
    }
}



