
package bankmangement;

import java.util.Scanner;


public class AccountHolder {
     
    int id;
    String name;
    double CurrentBalance;
    double deposite;
    double withdraw;
    final double interestRate=0.1;
    double InterestAmonut;
    double loanAmount;
    Scanner input;
    public AccountHolder(){
     input = new Scanner(System.in);
    }
    public void input(){
        System.out.println("Account holder name:");
        name=input.nextLine();
        System.out.println("innitial balance: ");
        CurrentBalance=input.nextDouble();
        deposite=0.0;
        withdraw=0.0;
        InterestAmonut=0.0;
        loanAmount=0.0;  
    }
    public boolean loanCheck(){
        if(CurrentBalance>500)
            return true;
        else
            return false;
    }
    
    public void getLoan(){
        if(loanCheck()){
            System.out.println("enter loan amount: ");
            loanAmount=input.nextDouble();
        }else{
            System.out.println("not yet....");
        }
    }
    
    public void deposit(double d){
        deposite+=d;
        CurrentBalance+=d;
    }
    public void withdraw(double w){
        withdraw-=w;
        CurrentBalance-=w;
    }
    public void interest(){
        InterestAmonut=CurrentBalance*interestRate;
    }
    public double getBalance(){
        return CurrentBalance;
    }
    
}
    

