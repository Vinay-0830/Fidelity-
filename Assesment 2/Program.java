import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insurance number: ");
        String insuranceNumber = sc.nextLine();
        System.out.println("Insurance name: ");
        String insuranceName = sc.nextLine();
        System.out.println("amount covered: ");
        double amountCovered = sc.nextDouble();

        System.out.println("Select:\n1.Life Insurance\n2.Motor Insurance");
        int option = sc.nextInt();

        Insurance insurance  = null;

        if(option == 1) {
            //life insurance
            LifeInsurance lifeInsurance = new LifeInsurance();
            lifeInsurance.setInsuranceNo(insuranceNumber);
            lifeInsurance.setInsuranceName(insuranceName);
            lifeInsurance.setAmountCovered(amountCovered);

            System.out.println("Policy term:");
            int policyTerm = sc.nextInt();
            lifeInsurance.setPolicyTerm(policyTerm);

            System.out.println("Benefit Percent:");
            Float benefitPercent = sc.nextFloat();
            lifeInsurance.setBenefitPercent(benefitPercent);

            insurance = lifeInsurance;
        }else if(option == 2) {
            //motor insurance
            MotorInsurance motorInsurance = new MotorInsurance();
            motorInsurance.setInsuranceNo(insuranceNumber);
            motorInsurance.setInsuranceName(insuranceName);
            motorInsurance.setAmountCovered(amountCovered);

            System.out.println("Depreciation Percent:");
            Float depPercent = sc.nextFloat();
            motorInsurance.setDepPercent(depPercent);

            insurance = motorInsurance;
        }else {
            System.out.println("Invalid option");
            return;
        }

        //call addpolicy with the created insurance object
        double premium = addPolicy(insurance,option);
        System.out.println("Calculated premium: " + premium);

        sc.close();

    }

    // The addPolicy method which determines which premium to calculate

    public static double addPolicy(Insurance insurance, int option) {
        if(option == 1) {
            //Life insurance
            LifeInsurance lifeInsurance = (LifeInsurance) insurance;
            return lifeInsurance.calculatePremium();
        }else if(option == 2) {
            //motor insurance
            MotorInsurance motorInsurance = (MotorInsurance) insurance;
            return motorInsurance.calculatePremium();
        }
        return 0;
    }
}
