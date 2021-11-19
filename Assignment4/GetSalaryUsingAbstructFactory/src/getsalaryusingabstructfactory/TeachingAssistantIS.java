package getsalaryusingabstructfactory;


/**
 *
 * @author Mostafa 3Tta
 */
public class TeachingAssistantIS implements Staff{

    @Override
    public void getSalary() {

        System.out.println("The Salary of TeachingAssistant of IS : 2500 ");
    }

    @Override
    public void getYearsOfWorks() {
        System.out.println("The year of work of TeachingAssistant  of IS: 3 years ");
    }
    
}
