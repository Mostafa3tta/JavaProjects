
package getsalaryassifnment;

/**
 *
 * @author Mostafa 3Tta
 */
public class Doctor implements Staff{

    @Override
    public void getSalary() {

        System.out.println("The Salary of Doctor : 6000 ");
    }

    @Override
    public void getYearsOfWorks() {
        System.out.println("The year of work of Doctor : 10 years ");
    }
    
    
}
