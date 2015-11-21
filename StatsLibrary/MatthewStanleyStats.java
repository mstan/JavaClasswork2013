/* Matthew Stanley
 * CSCI1104
 * Statistics Library
 * 11 November 2013
 */


public class MatthewStanleyStats {
  
  
  //Average with int input
  public static double Avg( int[] numbers ) {
   int total=0;
   double average = 0.0;
   
   for ( int i=0; i<numbers.length; i++ ) {
 total = total + numbers[i];
     }
   average = (total * 1.0) / (numbers.length * 1.0);
   return average;
   }
  
  //Average with double input
  public static double Avg( double[] numbers ) {
   double total=0;
   double average = 0.0;
   
   for ( int i=0; i<numbers.length; i++ ) {
 total = total + numbers[i];
     }
   average = (total * 1.0) / (numbers.length * 1.0);
   return average;
   }  
  
  
  //Max with int input
  public static int Max( int[] numbers ) {
   int max=numbers[0];
   
   for ( int i=0; i<numbers.length; i++ ) {
     if (numbers[i]>max ) {
       max = numbers[i];
     }
   }
   return max;
  }
  
  //Max with double input
  public static double Max( double[] numbers ) {
   double max=numbers[0];
   
   for ( int i=0; i<numbers.length; i++ ) {
     if (numbers[i]>max ) {
       max = numbers[i];
     }
   }
   return max;
  }  
  
  //Min with int input
  public static int Min( int[] numbers ) {
   int min=numbers[0];
   
   for ( int i=0; i<numbers.length; i++ ) {
     if (numbers[i]<min ) {
       min = numbers[i];
     }
   }
   return min;
  }    
  
  //Min with double input
  public static double Min( double[] numbers ) {
   double min=numbers[0];
   
   for ( int i=0; i<numbers.length; i++ ) {
     if (numbers[i]<min ) {
       min = numbers[i];
     }
   }
   return min;
  }    
  
  //Standard Deviance
  public static double StdDev( int[] numbers ) {
   double total = 0.0;
   double average = 0.0;
   double devNum = 0.0;
   double devOut = 0.0;
   
   for ( int i=0; i<numbers.length; i++ ) {
     total = total + numbers[i];
     
     }
   average = (total * 1.0) / (numbers.length * 1.0);
   
   for ( int j=0; j<numbers.length; j++) {
   devNum = devNum + (Math.pow((numbers[j] - average),2) * 1.0);
 }
   devOut = MatthewStanleyLibrary.sqrt( devNum / numbers.length);
   return devOut;
   } 
}