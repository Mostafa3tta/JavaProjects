
package getsalaryusingabstructfactory;

/**
 *
 * @author Mostafa 3Tta
 */
public class TeachingAssistantCS implements Staff{

    @Override
    public void getSalary() {

        System.out.println("The Salary of TeachingAssistant of CS : 3000 ");
    }

    @Override
    public void getYearsOfWorks() {
        System.out.println("The year of work of TeachingAssistant of Cs: 4 years ");
    }
    
}
