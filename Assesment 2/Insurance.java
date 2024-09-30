//base class
public class Insurance {
    private String insuranceNo;
    private String insuranceName;
    private Double amountCovered;

    //getters and setters
     public String getInsuranceNo() {
         return insuranceNo;
     }

     public void setInsuranceNo(String insuranceNo){
         this.insuranceNo = insuranceNo;
     }

     public String getInsuranceName(){
         return insuranceName;
     }

     public void setInsuranceName(String insuranceName){
         this.insuranceName = insuranceName;
     }

     public Double getAmountCovered(){
         return amountCovered;
     }

     public void setAmountCovered(Double amountCovered ){
         this.amountCovered = amountCovered;
     }
}

//child class for motor insurance

class MotorInsurance extends Insurance{
    private Double idv;
    private Float depPercent;

    //getters and setters
    public Double getIdv(){
        return idv;
    }

    public void setIdv(Double idv){
        this.idv = idv;
    }

    public Float getDepPercent(){
        return depPercent;
    }

    public void setDepPercent(Float depPercent){
        this.depPercent = depPercent;
    }

    public double calculatePremium(){
        idv = getAmountCovered()-((getAmountCovered()*depPercent)/100);
        return(idv*0.03);
    }
}

//child class for life insurance
class LifeInsurance extends Insurance{
    private int policyTerm;
    private Float benefitPercent;

    //getters and setters
    public int getPolicyTerm(){
        return policyTerm;
    }

    public void setPolicyTerm(int policyTerm){
        this.policyTerm = policyTerm;
    }

    public Float getBenefitPercent(){
        return benefitPercent;
    }

    public void setBenefitPercent(Float benefitPercent){
        this.benefitPercent = benefitPercent;
    }
    public double calculatePremium(){
        return(getAmountCovered()-((getAmountCovered()*benefitPercent)/100))/policyTerm;
    }
}










