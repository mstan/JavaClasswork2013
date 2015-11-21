/* Matthew Stanley
 * CSCI 1104
 * Change Counter
 * 11 September 2013
 */


public class ChangeCounter {
  
 
  
  
  
  //Variable Input
  private int penniesIn; //Pennies put in the Counter
  
  // Parameterized Constructor 
  public ChangeCounter ( int penniesIn ) {
    this.penniesIn = penniesIn;
  }
  
  // Return text response to the client
  public String getChangeCount() {
    
   int numDollars = (penniesIn/100);    //Number of dollars
   int numQuarters = (penniesIn%100)/25; //Number of quarters
   int numDimes = ((penniesIn%100)%25)/10; //Number of dimes
   int numNickels = (((penniesIn%100)%25)%10)/5; //Number of nickels
   int numPennies = penniesIn%5; //Number of pennies
    
    
   String response = "You have " + numDollars + " Dollars, " + numQuarters + " Quarters, " + numDimes + " Dimes, " + numNickels + " Nickels, " + numPennies + " Pennies"; 
   
   return response;
  }
 
  
}