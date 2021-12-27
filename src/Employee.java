import java.util.*;

public abstract class Employee implements EmployeeInfo, Comparable<Employee>{
   private String lastName;
   private String firstName;
   private String IDnum;
   private String sex;
   private GregorianCalendar hireDate;
   /**Constructor for Employee */
   public Employee(){
       lastName=" ";
       firstName=" ";
       IDnum=" ";
       sex=" ";
       hireDate=new GregorianCalendar(1957, 5, 25);
   }
   /**Constructor which assign the values in this class with new values
   * @param ln last name which needs to be replaced with
   * @param fn last name which needs to be replaced with
   * @param ID new employee ID
   * @param sex new string sex which needs to be replaced with the old String
   * @param hireDate hireDate which needs to be replaced with
   */
   public Employee(String ln, String fn, String ID, String sex, GregorianCalendar hireDate) {
       lastName=ln;
       firstName=fn;
       IDnum=ID;
       this.sex=sex;
       this.hireDate=hireDate;
   }
   /**gets the last name
   * @return last name
   */
   public String getln() {
       return lastName;
   }
   /**gets first name
   * @return first name
   */
   public String getfn() {
       return firstName;
   }
   /**returns Employee ID
   * @return Employee ID
   */
   public String ID() {
       return IDnum;
   }
   /**returns sex
   * @return sex
   */
   public String sex() {
       return sex;
   }
   /**returns hire date
   * @return hire date
   */
   public Calendar gethireDate(){
       return hireDate;
   }
   /**sets Last name with a new value
   * @param ln Last name
   */
   public void setln(String ln) {
       lastName=ln;
   }
   /**sets first name with a new value
   * @param fn First name
   */
   public void setfn(String fn) {
       firstName=fn;
   }
   /**sets Id with a new value
   * @param ID Employee ID
   */
   public void setID(String ID) {
       IDnum=ID;
   }
   /** replaces sex with a new value
   * @param sex
   */
   public void setSex(String sex) {
       this.sex=sex;
   }
   /**replaces hire date with a new value
   * @param date new hire date
   */
   public void sethireDate(GregorianCalendar date) {
       hireDate=date;
   }
   /** it returns string of the different employee details */
   @Override
   public String toString() {
       return "\n ID Employee number : "+IDnum +"\n Employee Name : "+firstName+" "+lastName+"\n Hire date: "+hireDate.get(Calendar.MONTH)+"/"+hireDate.get(Calendar.DAY_OF_MONTH)+"/"+hireDate.get(Calendar.YEAR);
   }
   /**Abstract method which calculates and returns employee monthly earnings
   * @return employee monthly earning
   */
   public abstract double monthlyEarnings();
   /**method used to compare two objects by last na
     * @param obj*/
   @Override
   public int compareTo(Employee obj) {
       if(lastName.compareTo(obj.lastName)==0)
           return 0;
       else if(lastName.compareTo(obj.lastName)>0) {
           return -1;
       }
       else {
           return 1;
       }
   }
}


