
package getsalaryusingabstructfactory;


public class CS extends AbstructFactory {
    
    @Override
    Staff getPos(String pos)
   {
       if(pos.equalsIgnoreCase("Doctor"))
         return new DoctorCs();
       else if (pos.equalsIgnoreCase("TeachinAsistant"))
               return new TeachingAssistantCS();
       
       return null;
   }
   
}
