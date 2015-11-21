/*
 * Matthew Stanley
 * CSCI 1104 4.3 - p 227
 * Employee.java
 */

public class Employee {
  
  //private variables
  private int hours; //hours worked in the week
  private double rate; //hourly rate of pay (dollars.cents)
  private double amountPaid; //Amount to be paid
  
  public String Pay(int hours, double rate) {

    
    if (hours <= 40) {
      amountPaid = hours * rate;
    }
    else {
      amountPaid = (40 * rate) + ( (hours - 40) * (rate * 1.5) );
    }
    
    String payment = "The paycheck will be for: $" + amountPaid;
    
    
    System.out.println(payment);
    return payment;
    
  }
}