package getsalaryassifnment;

import java.util.Scanner;
/**
 *
 * @author Mostafa 3Tta
 */
public class GetSalaryAssignment {


    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        
        System.out.println("Enter Doctor (D) or TeachinAsistant (TA) ");
        String Staff = in.nextLine();
        
        SalaryFactory sf = new SalaryFactory();
        Staff st = sf.salary(Staff);
        st.getSalary();
        st.getYearsOfWorks();
        
    
    }
    
}
