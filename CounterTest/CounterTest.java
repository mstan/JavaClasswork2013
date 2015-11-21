import org.junit.*;
import static org.junit.Assert.*;

public class CounterTest {
 
  private Counter typicalCounter;
  
  @Before
    public void setup() {
    typicalCounter = new Counter();
  }
  
  @Test
  public void testCounter() {
   assertEquals("first call to next in counter ", 1, typicalCounter.Next());
   assertEquals("known invalid return value of 99. ", 2, typicalCounter.Next());
   
   typicalCounter.Reset(); 
   assertEquals("first call to next after reset ", 1, typicalCounter.Next());
  
  }
}