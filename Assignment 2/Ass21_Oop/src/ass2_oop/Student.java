
package ass2_oop;


public class Student extends Person{
    
    private static String status;
  
    public Student(String name,String address,String phoneNumber,String email,String status)
    {
        super(name,address,phoneNumber,email);
        this.status = status;
      
    }
  
    public String ShowData()
    {
      
        return "\nName : "+getName()+ " Address : "+getAddress() +" Phone Number : "+getPhone()+" Email : "+ getEmail()+" Status :"+status;
    }
    
}
