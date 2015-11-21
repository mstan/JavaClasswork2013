/*
Matthew Stanley
CSCI 1104
Sample Project - Counter.ava
Due: 2013-08-28 12:00 PM

Simple counter from out of the book 
*/

package counters;

// Models a simple integer counter.

public class Counter {
  
  private int count;  //current count
  
  // Constructors:
  // Create a new Counter initialized to 0
  
  //Constructor
  public Counter () {
    count = 0;
  }
  
  // Queries:
  
  // The number of items counted
  
  // This is a query
  public int currentCount () {
    return count;
  }
  
  // Commands
  
  // Increment the count by 1
 
 // This is a command 
  public void incrementCount () {
    count = count + 1;
  }
  
  // Reset the count to 0
  
  // This is a command
  public void reset () {
    count = 0;
  }
  
}