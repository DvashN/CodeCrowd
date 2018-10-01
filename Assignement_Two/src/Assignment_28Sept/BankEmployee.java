package Assignment_28Sept;

/**
 *
 * @author A157879
 */
public class BankEmployee extends Employee
{
    private String bankName;
    
    public BankEmployee(String name, int employeeType, int salary, int age)
    {
        super(name, employeeType, salary, age);
        this.bankName = "Standard Bank";
    }
    
    @Override
    public void displayEmployee()
    {
        super.displayEmployee();
        System.out.println("Name of Bank : " + bankName);
        System.out.println();
    }
    
    @Override
    public String toString()
    {
        return bankName + ", " + super.toString();
    }    

    public String getBankName() 
    {
        return bankName;
    }

    public void setBankName(String bankName) 
    {
        this.bankName = bankName;
    }
}
