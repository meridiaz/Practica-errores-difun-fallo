//
// Instrucciones de compilación:
// javac -cp .:./hamcrest-core-1.3.jar:./junit-4.12.jar MinTest.java 
//


import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class countPositiveTests
{

   private int arr[];  // Test fixture

   //@Before      // Set up - Called before every test method.
   //public void setUp()
   //{
   //   arr = new int[];
   //}

   @After      // Tear down - Called after every test method.
   public void tearDown()
   {
      arr = null;  // redundant in this example!
   }

   @Test
   public void testButNoCodeError()
   {
   	arr = new int[0];
      assertEquals(countPositive.countpositive(arr), 0);
   }
   @Test
   public void testForNoError()
   {
   	arr = new int[2];
   	arr[0] = -1;
   	arr[1] = -2;
      assertEquals(countPositive.countpositive(arr), 0);
   }
   
   
   @Test
   public void testButNoCodeErrorCorrect()
   {
   	arr = new int[0];
      assertEquals(countPositive.countpositiveCorrect(arr), 0);
   }
   @Test
   public void testForNoErrorCorrect()
   {
   	arr = new int[2];
   	arr[0] = -1;
   	arr[1] = -2;
      assertEquals(countPositive.countpositiveCorrect(arr), 0);
   }
   
    @Test
   public void testCodeError()
   {
   	arr = new int[3];
   	arr[0] = 0;
   	arr[1] = 1;
   	arr[2] = 2;
	assertEquals(countPositive.countpositive(arr), 2);
   }
    @Test
   public void testCodeErrorCorrect()
   {
   	arr = new int[3];
   	arr[0] = 0;
   	arr[1] = 1;
   	arr[2] = 2;
	assertEquals(countPositive.countpositiveCorrect(arr), 2);
   }
   @Test
   public void testnull()
   {
   	arr = null;
      try {
         countPositive.countpositive (arr);
      } catch (NullPointerException e) {
         return;
      }
      fail ("NullPointerException expected");
   }
   
}
