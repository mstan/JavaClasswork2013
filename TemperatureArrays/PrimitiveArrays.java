import java.util.*; //import library with Random

public class PrimitiveArrays {
 
  static final int DAYS_IN_MONTH = 31;
  static int[] temperatures;
  
  
  
  public static void main( String[] args ) {
    
    temperatures = new int[DAYS_IN_MONTH]; // what does that stand for logically?
    
    createArray( temperatures );
    printArray( temperatures );
    
    System.out.println("The average temperature was " + average( temperatures ));
    System.out.println("Maximum value was: " + max(temperatures ));
    System.out.println("Minimum value was: " + min(temperatures ));    
    
    sort( temperatures );
    printArray ( temperatures );
    
    int test = 55;
    System.out.println("Index of " + test + " = " + (indexOf(temperatures,  test)+1));
  }
  
  public static void printArray( int[] numbers ) {
    System.out.println( "\nPrinting the array\n----------------\n");
    
    for ( int i=0; i<numbers.length; i++ ) {     
      System.out.println("  Element[" + i + "]  = " + numbers[i] );
      
    }
    
    System.out.println(  "\n-----------------------------");
    
  }
  
  public static void createArray ( int[] numbers ) {
   Random generator = new Random();
   
   for ( int i=0; i<numbers.length; i++ ) {
    numbers[i] =  generator.nextInt (150) - 30; 
   }
  }
  
  
  public static double average( int[] numbers ) {
   int sum = 0;
   
   for ( int i=0; i<numbers.length; i++ ) {
    sum+= numbers[i]; 
   }
   
   return 1.0*sum/numbers.length;
   
  }
  
  //Max and min assignemnt
  
  public static int max( int[] numbers ) {
   int max=numbers[0];
   
   for ( int i=0; i<numbers.length; i++ ) {
     if (numbers[i]>max ) {
       max = numbers[i];
     }
   }
   return max;
  }
  
  public static int min( int[] numbers ) {
   int min=numbers[0];
   
   for ( int i=0; i<numbers.length; i++ ) {
     if (numbers[i]<min ) {
       min = numbers[i];
     }
   }
   return min;
  }  
  
  public static void sort( int[] numbers ) {
    int tempSmallest;
    int slotToFill;
    int slotToTry;
    
    // go from first slot in the array down to the next to last
    // the next to last comparision will put the last item in its place
    // automatically
    
    for (slotToFill=0; slotToFill < numbers.length-1; slotToFill++) {
      
     tempSmallest = numbers[slotToFill];
     for (slotToTry = slotToFill +1 ; slotToTry < numbers.length; slotToTry++) {
       if ( numbers[slotToTry]  < tempSmallest ) {
         int tempSwap = numbers[slotToTry];             
         
         tempSmallest = numbers[slotToTry]; 
         tempSmallest = tempSwap;
     } 
    }
    // we've finished comparing the current slot to fill against all remaining slots in the array
     numbers[slotToFill] = tempSmallest;
   }
  }
  
  public static int indexOf (int [] numbers, int value) {
    // use binary search
    // assert: array is in sorted order
    
    // presumed not found until value found
    boolean found = false;
    
    // initial search area setup
    int left = 0;
    int right = numbers.length-1;
    int mid = (left+right ) / 2;
    

    while (!( numbers[mid]==value) && (left<=right)) {
      if ( numbers[mid] < value ) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
      mid = (left + right ) / 2;
    }
    
    if ( numbers[mid]==value ) {
     return mid; 
    }
    
    //default index/flag for value not found
    return -1;
  }
  
  //Standard Deviance
  public static double StdDev( int[] numbers ) {
   double average = 0.0;
   double devNum = 0.0;
   
   for ( int i=0; i<numbers.length; i++ ) {
     total = total + numbers[i];
     
     }
   average = (total * 1.0) / (numbers.length * 1.0);
   
   for ( int j=0; j<numbers.length; j++) {
   devNum = devNum + (Math.pow(2,(numbers[i] - average)))
 }
   }   

}  
  
  