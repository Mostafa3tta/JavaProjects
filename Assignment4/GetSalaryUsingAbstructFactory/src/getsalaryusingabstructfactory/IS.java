
package getsalaryusingabstructfactory;

/**
 *
 * @author Mostafa 3Tta
 */
public class IS extends AbstructFactory{

   @Override
    Staff getPos(String pos)
   {
       if(pos.equalsIgnoreCase("Doctor"))
         return new DoctorIS();
       else if (pos.equalsIgnoreCase("TeachinAsistant"))
               return new TeachingAssistantIS();
       return null;
   }
   
}
