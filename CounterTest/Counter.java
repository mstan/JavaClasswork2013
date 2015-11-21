class Counter {
  private int counter = 0;
  
  public Counter() {
   counter = 0; 
  }
  
  public int Next() {
   return ++counter; 
  }
  
  public void Reset() {
    counter = 0;
  }
}