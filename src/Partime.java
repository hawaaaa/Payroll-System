import java.util.*;

public class Partime extends Staff{
   private int hoursworked;
   /****Constructor part time which initiates the values*/
   public Partime() {
       super();
       hoursworked=0;
   }
   /**Overloaded constructor method
   * @param ln last name
   * @param fn first name
   * @param ID Employee ID
   * @param sex Sex
   * @param hireDate Hire date
   * @param hourlyRate Hourly rate
   * @param hoursworked Number of hours worked
   */
   public Partime(String ln, String fn, String ID, String sex, GregorianCalendar hireDate, int hourlyRate, int hoursworked) {
       super(ln,fn,ID,sex,hireDate,hourlyRate);
       this.hoursworked=hoursworked;
   }
   /**it returns hours worked
   * @return hours worked
   */
   public int getHoursWorked() {
       return hoursworked;
   }
   /** it sets the hours worked with new value
   * @param hoursWorked hours worked
   */
   public void setHoursWorked(int hoursWorked) {
       this.hoursworked=hoursWorked;
   }
   /** it returns monthly earnings of the part time employee
     * @return s*/
   @Override
   public double monthlyEarnings() {
       return super.hourlyrate()*hoursworked*4;
   }
   /**it returns string of the different Part time employee details
     * @return  */
   @Override
   public String toString() {
       return super.toString()+"\n Hours worked per month: "+hoursworked*4+"\n Monthly Salary: $"+monthlyEarnings();
   }
}


