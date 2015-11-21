import org.junit.*;
import static org.junit.Assert.*;

public class Location2DTest {

 private Location2D locTest;
 private Location2D locTest2;
 
 @Before
 public void setup() {
 locTest = new Location2D(3, 4);
 locTest2 = new Location2D(0, 0);
 }
 
 
 @Test
 public void locInstance() {
 assertEquals("Return X value of locTest", 3,
 locTest.getX());
 assertEquals("Return Y value of locTest", 4,
 locTest.getY());
 //assertEquals("Distance of locTest from LocTest2", 5, 
 //locTest.getDistance(locTest2));
 assertEquals("Distance of locTest from LocTest2", 6, 
 locTest.getDistance(locTest2), 0); //The zero after specifies a margin of error in doubles
 }
}