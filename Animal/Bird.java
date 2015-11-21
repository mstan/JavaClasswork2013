public class Bird extends Animal {
 
  public enum STATE { SITTING, STANDING, WALKING, FLYING, FALLING };
  
  private STATE currentState;
  
  
  public Bird() {
    this.currentState = SITTING;
  }
  
  
  public changeState( STATE state ) {
   this.currentState = state; 
  }
  
  public void moveTo( Location2D location ) {
   
    // If SITTING, change to STANDING and exit
    if ( currentState == SITTING ) {
     currentState = STANDING; 
     return;
    }
    //else
  }
  
  public void makeNoise() {
   System.out.println("Chirp"); 
   
  }
}