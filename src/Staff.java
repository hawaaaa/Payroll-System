import java.util.*;

public class Staff extends Employee {
   private int HourlyRate;
   /**Constructor Staff which initiates the values*/
   public Staff() {
       super();
       HourlyRate=0;
   }
   /**Overloaded constructor method
   * @param ln last name  
   * @param fn first name
   * @param ID Employee ID
   * @param sex Sex
   * @param hireDate Hired Date
   * @param hourlyRate Hourly rate for the work
   */
   public Staff(String ln, String fn, String ID, String sex, GregorianCalendar hireDate, int hourlyRate) {
       super(ln,fn,ID,sex,hireDate);
       HourlyRate=hourlyRate;
   }
   /** methods which returns monthly earning of the staff*/
   @Override
   public double monthlyEarnings() {
       return HourlyRate*STAFF_MONTHLY_HOURS_WORKED;
   }
   /** it returns hourly rate
   * @return hourly rate
   */
   public int hourlyrate() {
       return HourlyRate;
   }
   /** it replaces the hourly rate with new value
     * @param hr
   */
   public void setHourlyRate(int hr) {
       HourlyRate=hr;
   }
   /**it returns string of the different Staff details
     * @return  */
   @Override
   public String toString() {
       if(this instanceof Partime) {
           return super.toString();
       }
       else
           return super.toString()+"\n Full Time\n Monthly Salary: $"+monthlyEarnings();
   }
  
}
