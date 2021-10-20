package as2_account;

import java.util.Date;



public class As2_Account {


    public static void main(String[] args) {
        
        Account account1 = new Account(1122, 20000, .045);
        
    account1.withdraw(5000);
   
    
    account1.deposit(7000);
    
    
    System.out.println("Account ID:" + account1.getId());
    
    System.out.println("Balance:" + account1.getBalance());
    
    System.out.println("Interest Rate:" + account1.getAnnualInterestRate());
    
    System.out.println("Balance after withdraw of 5000:" +       account1.getAnnualInterestRate());
    
    System.out.println("Balance after deposit of 7000:" + account1.getAnnualInterestRate());
    

    System.out.println("Thank You \n By: Mostafa 3Tta");
    }
    
}
