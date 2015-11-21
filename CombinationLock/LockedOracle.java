public class LockedOracle {
  
  Oracle oracle;
  CombinationLock lock;
  String fortune;
  
  public LockedOracle( int key ) {
   Oracle oracle = new Oracle();
   CombinationLock lock = new CombinationLock( key );
   lock.close();
  }
  
  public void augurFortune( int key) {
   lock.open ( key );
   if ( lock.isOpen() ) {
     oracle.awake();
     fortune = oracle.fortune();
     oracle.sleep();
     lock.close();
   } else { 
     fortune = Oracle.NO_FORTUNE;
   }
  }
  
  public String fortune() {
   return this.fortune; 
  }
  
}