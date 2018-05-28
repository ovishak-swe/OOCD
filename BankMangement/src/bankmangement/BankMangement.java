
package bankmangement;


public class BankMangement {

    
    public static void main(String[] args) {
        AccountHolder obj= new AccountHolder();
        System.out.println("enter 1st account details: ");
        obj.input();
        double m1= obj.getBalance();
        AccountHolder obj2= new AccountHolder();
        System.out.println("enter 2nd account details: ");
        obj2.input();
        double m2= obj2.getBalance();
        double allAccounrAmount=m1+m2;
        manager objm= new manager();
        System.out.println("manager details: ");
        objm.employeeInput();
        double salary = objm.salaryCalculation(allAccounrAmount);
        System.out.println("manger salary is: "+salary);
        
        Accountant obja= new Accountant();
        System.out.println("Accountent details: ");
        obja.employeeInput();
        double asalary= obja.salaryClaculation(allAccounrAmount);
        System.out.println("Accountent salary is: "+asalary);
        
    }
    
}
        
    
    

