
package bankmangement;

import java.util.Scanner;


public class Employee {
    String name;
    double age;
    final double fixedSalary=8000.0;
    double eidBonus;
    double honorSalary;
    double salary;
    Scanner input;
    
    public Employee(){
        input=new Scanner(System.in);
    }
    
    public void employeeInput(){
        System.out.println("name: ");
        name=input.nextLine();
        System.out.println("age: ");
        age=input.nextDouble();
        System.out.println("honor bouns: ");
        honorSalary=input.nextDouble();
        System.out.println("eid bouns: ");
        eidBonus=input.nextDouble();
    }
    
}
    

