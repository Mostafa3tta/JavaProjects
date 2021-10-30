
package ass2_oop;

public class MyDate {
    private int year;
    private int month;
    private int day;
  
    public MyDate(int day,int month,int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
   public String ShowDate()
   {
       return " "+day+"/"+month+"/"+year;
   }
}
