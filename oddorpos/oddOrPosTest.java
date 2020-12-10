//
// Instrucciones de compilación:
// javac -cp .:./hamcrest-core-1.3.jar:./junit-4.12.jar MinTest.java 
//


import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class oddOrPosTest
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
      assertEquals(oddOrPos.oddorpos(arr), 0);
   }
   @Test
   public void testForNoError()
   {
   	arr = new int[2];
   	arr[0] = 1;
   	arr[1] = 2;
      assertEquals(oddOrPos.oddorpos(arr), 2);
   }
   
   
   @Test
   public void testButNoCodeErrorCorrect()
   {
   	arr = new int[0];
      assertEquals(oddOrPos.oddorposCorrect(arr), 0);
   }
   @Test
   public void testForNoErrorCorrect()
   {
   	arr = new int[2];
   	arr[0] = 1;
   	arr[1] = 2;
      assertEquals(oddOrPos.oddorposCorrect(arr), 2);
   }
   
    @Test
   public void testCodeError()
   {
   	arr = new int[2];
   	arr[0] = -1;
   	arr[1] = 2;
	assertEquals(oddOrPos.oddorpos(arr), 2);
   }
    @Test
   public void testCodeErrorCorrect()
   {
   	arr = new int[2];
   	arr[0] = -1;
   	arr[1] = 2;
	assertEquals(oddOrPos.oddorposCorrect(arr), 2);
   }
   @Test
   public void testnull()
   {
   	arr = null;
      try {
         oddOrPos.oddorpos (arr);
      } catch (NullPointerException e) {
         return;
      }
      fail ("NullPointerException expected");
   }
   
}
