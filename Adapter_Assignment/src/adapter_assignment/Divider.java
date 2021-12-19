
package adapter_assignment;

import java.math.BigDecimal;

/**
 *
 * @author Mostafa 3Tta
 */
public class Divider implements DivideInterface {

    BigDecimal BD;

    public Divider(BigDecimal BD) {
        this.BD = BD;
    }
    

    @Override
    public BigDecimal divide(BigDecimal BD) {
                    
        return this.BD.divide(BD);
    }
    
}
