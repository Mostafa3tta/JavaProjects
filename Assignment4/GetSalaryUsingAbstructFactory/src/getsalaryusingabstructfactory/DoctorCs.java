
package getsalaryusingabstructfactory;

/**
 *
 * @author Mostafa 3Tta
 */
public class DoctorCs implements Staff{

    @Override
    public void getSalary() {

        System.out.println("The Salary of Doctor of Cs : 8000 ");
    }

    @Override
    public void getYearsOfWorks() {
        System.out.println("The year of work of Doctor OF Cs: 11 years ");
    }
    
    
}
