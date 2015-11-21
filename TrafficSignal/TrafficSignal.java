/* Matthew Stanley
 * CSCI 1104
 * Traffic Signal 
 * 2013 September 9
*/

public class TrafficSignal {
  
  // Named constants
  public static final int GREEN = 0;
  public static final int YELLOW = 1;
  public static final int RED = 2;
  
  // State variables
  private int light;
  
  
  
  // Constructor
  public TrafficSignal() {
    light = TrafficSignal.GREEN; //Do not need to add TrafficSignal because same class
  }
 
  
  public void change() {
   light = ( light + 1 ) % 3; 
  }
  
  public int getLight () {
    return light;
  }
  
}