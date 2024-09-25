public class Employee {
    int id;
    String name;
    float basicSalary;
    float bonus;
    float netSalary;

    void DisplayDetails() {
        System.out.println(" Emloyee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netSalary);

    }
}

class PermanentEmployee extends Employee {
    int pf;

    void initialize(int id, String name, float basicSalary, int pf) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.pf = pf;
        calculateBonus();
        calculateNetSalary();
    }

    void calculateBonus() {
        if (pf < 1000) {
            bonus = 0.10f * basicSalary;
        } else if (pf >= 1000 && pf < 1500) {
            bonus = 0.115f * basicSalary;
        } else if (pf >= 1500 && pf < 1800) {
            bonus = 0.12f * basicSalary;
        } else {
            bonus = 0.15f * basicSalary;
        }
    }

    void calculateNetSalary() {
        netSalary = basicSalary - pf + bonus;
    }

    void displayDetails() {
        super.DisplayDetails();
        System.out.println("PF: " + pf);
    }
}

    class TemporaryEmployee extends Employee {
        int dailyWages;
        int noofDays;

        void initialize(int id, String name, int dailyWages, int noofDays) {
            this.id = id;
            this.name = name;
            this.dailyWages = dailyWages;
            this.noofDays = noofDays;
            calculateBonus();
            calculateNetSalary();
        }

        void calculateBonus() {
            netSalary = dailyWages * noofDays;
            if (dailyWages < 1000) {
                bonus = 0.15f * netSalary;
            } else if (dailyWages >= 1000 && dailyWages < 1500) {
                bonus = 0.12f * netSalary;
            } else if (dailyWages >= 1500 && dailyWages < 1750) {
                bonus = 0.11f * netSalary;
            } else {
                bonus = 0.08f * netSalary;
            }
        }

        void calculateNetSalary() {
            netSalary = dailyWages * noofDays + bonus;
        }
    }


