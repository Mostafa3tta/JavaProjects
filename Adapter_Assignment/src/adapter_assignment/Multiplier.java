
package adapter_assignment;

import java.math.BigDecimal;

/**
 *
 * @author Mostafa 3Tta
 */
public class Multiplier implements MultiplyInterface{

    
        BigDecimal BD;
        
        public Multiplier(BigDecimal BD) {
        this.BD = BD;
    }
        
    @Override
    public BigDecimal multiply(BigDecimal BD) {
        return this.BD.multiply(BD);
    }
    
}
