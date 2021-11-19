
package getsalaryassifnment;

/**
 *
 * @author Mostafa 3Tta
 */
public class SalaryFactory {
    public Staff salary(String p)
    {
        String s = p.toLowerCase();
        
        switch(p)
        {
            case "ta":
                return new TeachingAssistant();
            case "d":
                    return  new Doctor();
            default:
                return null;
        }
    }
    
}
