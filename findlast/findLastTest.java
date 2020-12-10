//
// Instrucciones de compilación:
// javac -cp .:./hamcrest-core-1.3.jar:./junit-4.12.jar MinTest.java 
//


import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class findLastTest
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
   public void testForNoError()
   {
   	arr = new int[0];
      assertEquals(findLast.findlast(arr, 1), -1);
   }
    @Test
   public void testForNoError2()
   {
   	arr = new int[3];
   	arr[0] = 0;
   	arr[1] = 1;
   	arr[2] = 2;
      assertEquals(findLast.findlast(arr, 2), 2);
   }
   public void testForNoError2Correct()
   {
   	arr = new int[3];
   	arr[0] = 0;
   	arr[1] = 1;
   	arr[2] = 2;
      assertEquals(findLast.findlastCorrect(arr, 2), 2);
   }
   @Test
   public void testErrorButNotDisfuntion()
   {
   	arr = new int[3];
   	arr[0] = 0;
   	arr[1] = 1;
   	arr[2] = 2;

      assertEquals(findLast.findlast(arr, 3), -1);
   }
   @Test
   public void testForNoErrorCorrect()
   {
   	arr = new int[0];
      assertEquals(findLast.findlastCorrect(arr, 1), -1);
   }
   @Test
   public void testErrorButNotDisfuntionCorrect()
   {
   	arr = new int[3];
   	arr[0] = 0;
   	arr[1] = 1;
   	arr[2] = 2;
      assertEquals(findLast.findlastCorrect(arr, 3), -1);
   }
   @Test
   public void testErrorCorrect()
   {
   	arr = new int[3];
   	arr[0] = 0;
   	arr[1] = 1;
   	arr[2] = 2;
      assertEquals(findLast.findlastCorrect(arr, 0), 0);
   }
   @Test
   public void testError()
   {
   	//System.out.println("en test no disfuntion");
   	arr = new int[3];
   	arr[0] = 0;
   	arr[1] = 1;
   	arr[2] = 2;
   	//System.out.println("en test no disfuntion"+arr[2]);
      assertEquals(findLast.findlast(arr, 0), 0);
   }
   @Test
   public void testnull()
   {
   	arr = null;
      try {
         findLast.findlast(arr, 1);
      } catch (NullPointerException e) {
         return;
      }
      fail ("NullPointerException expected");
   }
}
