//
// Instrucciones de compilación:
// javac -cp .:./hamcrest-core-1.3.jar:./junit-4.12.jar MinTest.java 
//


import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class lastZeroTest
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
   	arr = new int[1];
   	arr[0] = 0;
      assertEquals(lastZero.lastzero(arr), 0);
   }
   @Test
   public void testErrorButNotDisfuntion()
   {
   	//System.out.println("en test no disfuntion");
   	arr = new int[3];
   	arr[0] = 0;
   	arr[1] = 1;
   	arr[2] = 2;
   	//System.out.println("en test no disfuntion"+arr[2]);
      assertEquals(lastZero.lastzero(arr), 0);
   }
   @Test
   public void testForNoErrorCorrect()
   {
   	arr = new int[1];
   	arr[0] = 0;
      assertEquals(lastZero.lastzeroCorrect(arr), 0);
   }
   @Test
   public void testErrorButNotDisfuntionCorrect()
   {
   	//System.out.println("en test no disfuntion");
   	arr = new int[3];
   	arr[0] = 0;
   	arr[1] = 1;
   	arr[2] = 2;
   	//System.out.println("en test no disfuntion"+arr[2]);
      assertEquals(lastZero.lastzeroCorrect(arr), 0);
   }
   @Test
   public void testErrorCorrect()
   {
   	//System.out.println("en test no disfuntion");
   	arr = new int[3];
   	arr[0] = 0;
   	arr[1] = 1;
   	arr[2] = 0;
   	//System.out.println("en test no disfuntion"+arr[2]);
      assertEquals(lastZero.lastzeroCorrect(arr), 2);
   }
   @Test
   public void testError()
   {
   	//System.out.println("en test no disfuntion");
   	arr = new int[3];
   	arr[0] = 0;
   	arr[1] = 1;
   	arr[2] = 0;
   	//System.out.println("en test no disfuntion"+arr[2]);
      assertEquals(lastZero.lastzero(arr), 2);
   }
   @Test
   public void testnull()
   {
   	arr = null;
      try {
         lastZero.lastzero (arr);
      } catch (NullPointerException e) {
         return;
      }
      fail ("NullPointerException expected");
   }
}
