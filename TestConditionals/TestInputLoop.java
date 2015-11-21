import java.util.*;

public class TestInputLoop {
 
  public static void main( String args[] ) {
   
    Scanner keyboard = new Scanner ( System.in );
    String input = "";
    String prompt = "Enter a name or I'll cut you : ";
    String message = "Nie to meet you, ";
    
    // Get initial input (might want to quit immediately
    System.out.print( prompt );
    input = keyboard.next();
    
      while ( input.toUpperCase().compareTo( "quit".toUpperCase() ) != 0) {
        System.out.println( message + input );
    
    
    System.out.print ( prompt ); // is there more input?
    input = keyboard.next();
      }
  }
}
  
  
