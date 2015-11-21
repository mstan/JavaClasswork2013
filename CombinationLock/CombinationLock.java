public class CombinationLock { 
  
  public static final int OPEN = 1;
  public static final int CLOSED = 2;
  
  int key;
  int status;
  
  public CombinationLock ( int key ) {
   this.key = key;
   this.status = status = CLOSED;
  }
  
  public boolean isOpen()  {
   return (this.status == OPEN); 
  }
  
  public void open (int keyToTry) {
    if ( this.isOpen() || (this.key == keyToTry) ) {
     this.status = OPEN; 
    }
  }
  
  public void close() {
    this.status = CLOSED;
  }

}