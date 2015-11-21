public class TestConditionals {

  public static void main( String args[] ) {
    
    char keystroke = 'z';
    String response = "";
    
    switch ( keystroke ) {
      case 'd':
      case 'D':
        response = "Keystroke is d";
        break;
      case 'c':
      case 'C':
        response = "Keystroke is c";
        break;
      case 'b':
      case 'B':
        response = "Keystroke is b";
        break;
      case 'a':
      case 'A':
        response = "Keystroke is a";
        break;
      default: //can go anywhere with cases
        response = "Unknown keystroke";
        break;
    }
    System.out.println ( response );
    
  }
}