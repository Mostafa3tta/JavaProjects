
package ass2_oop;

public class Person 

{
    String name;
    String address;
    String phone;
    String Email;
   
Person(String name,String address,String phone, String Email)
{
    this.name=name;
    this.address=address;
    this.phone=phone;
    this.Email=Email;
}

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return Email;
    }


}
