public class DeptSecurities extends Income {
    

    public DeptSecurities(String code,String name,double amount,String form) {
        super(code,name,amount, form);

    }
//Getters and setters
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getForm() {
        return form;
    }
    
    public String toExplain() {
        return getName() + "represent money borrowed by another party from another, under the condition that the borrower will repay the amount plus interest at a specified future date.";

 
    } 
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount(); 
    }






    
}
