
package getsalaryusingabstructfactory;

/**
 *
 * @author Mostafa 3Tta
 */
public class SalaryFactory {
    
    public static  AbstructFactory getCsOrIs(boolean depCs)
    {
        if(depCs)
        {
            return new CS();
        }
        else 
        {
            return new IS();
        }
    }
    
}
