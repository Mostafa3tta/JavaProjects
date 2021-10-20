package as2_account;



public class Account {
    
   private  int id ;
   private  double balnce ;
   private  double annualInterestRate  ;
   
   Account(){
    id = 0;
    balnce = 0.0;
    annualInterestRate  = 0.0;
   }
   
   Account(int Id, double Balnce){
       id=Id;
       balnce = Balnce;
   }
   
   Account(int newId, double newBalance, double newAnnualInterestRate) {
    id = newId;
    balnce = newBalance;
    annualInterestRate = newAnnualInterestRate;
}   
   
     
public int getId() {
    return id;
}


public double getBalance() {
    return balnce;
}


public double getAnnualInterestRate() {
    return annualInterestRate;
}


public void setId(int newId) {
    id = newId;
}


public void setBalance(double newBalance) {
    balnce = newBalance;
}


public void setAnnualInterestRate(double newAnnualInterestRate) {
    annualInterestRate = newAnnualInterestRate;
}


double getMonthlyInterestRate() {
    return annualInterestRate/12;
}


double withdraw(double amount) {
    return balnce -= amount;
}   


double deposit(double amount) {
    return balnce += amount;   
}
}

