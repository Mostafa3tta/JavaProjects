
package ass2_oop;


public class Ass2_Oop {

 
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       Student s = new Student("Mostafa 3tta","Elminya ","01062947371","mostafatop985@gmail.com","...");
      
       System.out.println(s.toString());
      
       MyDate d = new MyDate(5,12,2016);
      
       Employee e = new Employee("Mahmoud","Mallwy","01234567891","mahmoud@email.com","6756,street",7666.67,d);
      
       System.out.println(e.toString());
    }
    
}
