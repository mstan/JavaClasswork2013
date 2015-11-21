public class Oracle {
  
  public static final int AWAKE = 1;
  public static final int ASLEEP = 2; 
  
  //Fortune Strings
  public static final String NO_FORTUNE = 
    "No fortune for you!";
  public static final String FORTUNE =
    "Your fortune will be told";

    

  private int status;
  private String fortune;
  
  public Oracle() {
   this.status = ASLEEP;
   this.fortune = NO_FORTUNE;
  }
  
  public boolean isAwake() {
   return (this.status == AWAKE);
  }
  
  public void awake() {
   this.status = AWAKE; 
  }

  public void sleep() {
   this.status = ASLEEP; 
  }
  
  public String fortune() {
    if (this.fortune == NO_FORTUNE ) {
      this.fortune = FORTUNE;
    } else {
      this.fortune = NO_FORTUNE;
    }
    return this.fortune;
  }
  
}