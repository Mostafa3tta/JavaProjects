
package adapter_assignment;

import java.math.BigDecimal;

/**
 *
 * @author Mostafa 3Tta
 */
public class DividerAdapter implements DivideInterface   {
    
    MultiplyInterface MI;

    String O;

    public DividerAdapter( String O) {
        this.O= O;
    }
    
    @Override
    public BigDecimal divide(BigDecimal BD) {
        
        if (O.equalsIgnoreCase("M"))
        {
         MI = new Multiplier(BD);
         return MI.multiply(BD);
        }
        else if (O.equalsIgnoreCase("D"))
        {
            return divide(BD);
        }
        else 
        {
        return BD;
        }
    }
    
}
