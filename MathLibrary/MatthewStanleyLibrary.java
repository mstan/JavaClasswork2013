public class MatthewStanleyLibrary {
  
  public static double LeibnizPi( int iterations ) {
    double result = 0;
 
 for (int n = 0; n < iterations; n=n+1) {
 result = ((Math.pow(-1,n)/(2*n + 1)) * 4)  + result;
 }
    return result;
  }
 
  public static double OptimizedLeibnizPi( int iterations ) {
    double result = 0;
 
 for (int n = 0; n < iterations; n=n+1) {
 result = 4*2/(16*Math.pow(n,2) + 16*n + 3) + result;
 }
    return result;
  }
  
  public static double sqrt( double x, int places ) {
    double result = 0;
 
 double addToResult = 0;
 for (double m=0; m<=places; m=m+1)
 {
  for(double n = 0; Math.pow((result + n), 2)<= Math.abs(x); n = n+Math.pow(10,-m)) {
  addToResult= n;
  }
  result = result + addToResult;
  }
  if(x<0){
  result = -1*result; 
  }  
    return result;
  }
  
  public static double cubert( double x, int places ) {
    double result = 0;
 
 double addToResult = 0;
 for (double m=0; m<=places; m=m+1)
 {
  for(double n = 0; Math.pow((result + n), 3)<= Math.abs(x); n = n+Math.pow(10,-m)) {
  addToResult= n;
  }
  result = result + addToResult;
  }
  if(x<0){
  result = -1*result; 
  }
    return result;
  }  
}