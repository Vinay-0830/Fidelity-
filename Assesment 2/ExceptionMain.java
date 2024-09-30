import java.lang.Exception;
import java.util.Scanner;

public class ExceptionMain {

    //method to find employee by ID
    public static Employee findEmployeeById(Employee[] employees,int id) throws Exception{
        for(Employee employee : employees) {
            if(employee.getId() == id) {
                return employee;
            }
        }
        throw  new Exception("Employee with ID" + id + "not found");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter employee id for Employee " + (i+1) + ": ");
            int id = sc.nextInt();
            System.out.println("Enter employee  name: ");
            String name = sc.next();
            employees[i] = new Employee(id,name);
        }
        System.out.println("Enter the employee id to be found: ");
        int id = sc.nextInt();
        try{
            Employee employee = findEmployeeById(employees,id);
            System.out.println("employee found : "+employee.getName());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
