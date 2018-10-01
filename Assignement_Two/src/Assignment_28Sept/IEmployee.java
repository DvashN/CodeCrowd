package Assignment_28Sept;

/**
 *
 * @author A157879
 */
public interface IEmployee 
{
    public void displayEmployee();
    public void activateEmployee();
    public void deactivateEmployee();
    
    static final int MANAGER = 10;
    static final int DEVELOPER = 20;
    static final int EXEC = 30;    
}
