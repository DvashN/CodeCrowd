package Assignment_28Sept;

/**
 *
 * @author A157879
 */
public abstract class Employee implements IEmployee
{
    private String name;
    private int employeeType;
    private int salary;
    private int age;
    private boolean active = false;
    
    public Employee(String name, int employeeType, int salary, int age)
    {
        this.name = name;
        this.employeeType = employeeType;
        this.salary =  salary;
        this.age = age;
    }
    
    @Override
    public void displayEmployee() 
    {
        System.out.println("Name of Employee : " + name);
        System.out.println("Empoyee Type : " + employeeType);
        System.out.println("Monthly Salary : R" + salary);
        System.out.println("Age of Employee : " + age);
        System.out.println("Is Employee activated : " + active);
    }
    
    @Override
    public void activateEmployee()
    {
        setActive(true);
    }
    
    @Override
    public void deactivateEmployee()
    {
        setActive(false);
    }
    
    public void setSalary(int amount) throws Exception
    {
        if (amount < 1000)
        {
            try 
            {
                throw new Exception();
            } 
            catch (Exception ex) 
            {
                System.out.println("Salary too low");
            }
        }       
        else if (amount > 100000)
        {
            try 
            {
                throw new Exception();
            } 
            catch (Exception ex) 
            {
                System.out.println("Salary too high");
            }
        }
        else if (employeeType == MANAGER && amount < 20000)
        {
            try 
            {
                throw new Exception();
            } 
            catch (Exception ex) 
            {
                System.out.println("Salary not enough");
            }
        }
        else if (employeeType == DEVELOPER && amount > 30000)
        {
            try 
            {
                throw new Exception();
            } 
            catch (Exception ex) 
            {
                System.out.println("Salary out of Range");
            }
        }
        else if (employeeType == EXEC && amount < 50000)
        {
            try 
            {
                throw new Exception();
            } 
            catch (Exception ex) 
            {
                System.out.println("Salary not in Range");
            }
        }
    }
    
    @Override
    public boolean equals(Object obj)
    {
        Employee emp = (Employee) obj;
        if (emp.name == this.name && emp.employeeType == this.employeeType && emp.salary == this.salary && emp.age == this.age) 
        {
            return true;
        }
        else
        {
            return false;
        } 
    }
    
    @Override
    public String toString()
    {
        return name + ", " + age + ", " + employeeType + ", " + salary;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getEmployeeType() 
    {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) 
    {
        this.employeeType = employeeType;
    }

    public int getSalary() 
    {
        return salary;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public boolean isActive() 
    {
        return active;
    }

    public void setActive(boolean active) 
    {
        this.active = active;
    }
}
