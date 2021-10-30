
package ass2_oop;


public class Employee extends Person {

    private String office;
    private double salary;
    private MyDate dateHired;
  
    public Employee(String name,String address,String phoneNumber,String email,String office,double salary,MyDate dateHired)
    {
        super(name,address,phoneNumber,email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    
        public String toString()
    {
        return "\nName : "+getName()+ " Address : "+getAddress() +" Phone Number : "+getPhone()+" Email : "+ getEmail()+" Office : "+office +" Salary : "+salary + " Hiredate : "+dateHired;
    }
        
}
