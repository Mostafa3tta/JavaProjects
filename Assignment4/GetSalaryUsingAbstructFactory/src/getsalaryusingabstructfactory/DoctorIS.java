
package getsalaryusingabstructfactory;

/**
 *
 * @author Mostafa 3Tta
 */
public class DoctorIS implements Staff{

    @Override
    public void getSalary() {

        System.out.println("The Salary of Doctor of Is: 6000 ");
    }

    @Override
    public void getYearsOfWorks() {
        System.out.println("The year of work of Doctor of IS : 10 years ");
    }
    
    
}
