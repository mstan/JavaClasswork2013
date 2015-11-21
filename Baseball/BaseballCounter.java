/*
 * Matthew Stanley
 * CSCI 1104 Baseball Ball & Strike Counter
 * BaseballCounter.java
 */



package baseball;

public class BaseballCounter {
  
  // Variables
  private int Strikes; //Strikes
  
  private int Balls; //Balls
  
  

    
  // Constructor to initialize Strikes & Balls to 0 
  public BaseballCounter () {
    Strikes = 0;
    Balls = 0;
  }
  
  // Queries
  
  // Return number of strikes
  public int currentStrikes () {
    return Strikes;
  }  
  
  // Return number of balls
  public int currentBalls () {
    return Balls;
  }    
  
  // Criteria of 3 Strikes / 4 Balls met. Reset to 0.
  public void BatterOut () {
    Strikes = 0;
    Balls = 0;
  }  
  
  
  // Commands
  
  // Strikes
   public void incrementStrikes () {
  // Increment current Strike count by 1     
    Strikes = Strikes + 1;
    // If there's 3 strikes, call on BatterOut
    if (Strikes == 3) {
    BatterOut ();
    }  
  } 
   
  // Balls
   public void incrementBalls () {
     // Increase current ball count by 1
    Balls = Balls + 1;
    // If there's 4 balls, call on BatterOut
      if (Balls == 4) {
      BatterOut ();
      }
  } 
}




  


  
  
