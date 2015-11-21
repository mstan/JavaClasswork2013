import java.util.Scanner; //scanner import
  
 public class PiApproximaterTest { //Create class 
  
     public static void main(String[] args) {   //Construct scanner   
          
         Scanner sc = new Scanner(System.in); //new canner
         System.out.println ("This program will approximate the value of Pi"); //Information text
         System.out.println ("Please enter the value of n"); //Information text
         int n = sc.nextInt(); //Assign input
         System.out.println ("Please enter the number of times you wish to run this program. (The more you run it the more accurate the answer will be) "); //Number of times to run it
         int runTime = sc.nextInt(); //Assign input
          
         for (int i = n; i < runTime; i++) {
             n += 1;
         }
             System.out.println ("The value of pi is: " + (n * 4) *( Math.pow(-1 , n))/ (2 * n + 1) );
     }
 } 