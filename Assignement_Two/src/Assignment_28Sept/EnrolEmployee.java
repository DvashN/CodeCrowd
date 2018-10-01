package Assignment_28Sept;

import static Assignment_28Sept.IEmployee.DEVELOPER;
import static Assignment_28Sept.IEmployee.EXEC;
import static Assignment_28Sept.IEmployee.MANAGER;

/**
 *
 * @author A157879
 */
public class EnrolEmployee 
{
    public static void main(String[] args) throws Exception 
    {
        BankEmployee bob = new BankEmployee("Bob", MANAGER, 30000, 30);
        BankEmployee jerry = new BankEmployee("Jerry", DEVELOPER, 20000, 20);
        BankEmployee tom = new BankEmployee("Tom", EXEC, 50000, 40);
        
        bob.activateEmployee();
        jerry.activateEmployee();
        tom.activateEmployee();
        
        bob.displayEmployee();
        jerry.displayEmployee();
        tom.displayEmployee();
        
        bob.deactivateEmployee();
        
        BankEmployee newOne = bob;
        
        System.out.println("Is new employee equal to old Employee: " + newOne.equals(bob));
        System.out.println();
        
        newOne.setSalary(10000);
        tom.setSalary(40000);
        jerry.setSalary(50000);
        
        jerry.setSalary(999);
        tom.setSalary(200000);
        System.out.println();
        
        System.out.println(bob);
        System.out.println();
        System.out.println(jerry);
        System.out.println();
        System.out.println(tom);
        System.out.println();
        System.out.println(newOne);
    }
    
}
