public class Location2D {
  
  private int x;
  private int y;
  
  public Location2D( int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  public int getX() {
    return x;
  }
  
  public int getY() {
    return y; 
  }
  
  public double getDistance( Location2D other ) {
   
    double x = other.getX();
    double y = other.getY();
    
    double distance = Math.pow( Math.pow( x - this.x, 2 ) + Math.pow( y - this.y, 2 ), 0.5 ); 
    
    return distance;
    
  }
  
  public String toString() {
    return "(" + this.getX() + ", " + this.getY() + ")"; 
  }

}
