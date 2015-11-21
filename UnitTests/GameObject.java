public class GameObject {
  
 Location2D loc;
 String description;
 
  public GameObject( String description, Location2D loc ) {
   this.loc = loc;
   this.description = description;
 }
 
 public GameObject() {
   this( "untitled", null );
 }
  
 public GameObject( String description ) {
  this( description, null );
 }
 

 public GameObject( Location2D loc ) {
    this( "untitled", loc );                                 
 }
 
 public String toString() {
   String response = "";
   if ( description.length() == 0 ) {
     response = "untitled ";
   } else {
     response = description + " ";
   }
   
   if ( loc == null ) {
     response += "location unknown";
   } else {
     response += loc.toString();
   }
   return response;
   
 }
}