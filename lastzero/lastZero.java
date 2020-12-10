
import java.util.*;

public class lastZero
{
  /**
    * Returns the mininum element in a list
    * @param list Comparable list of elements to search
    * @return the minimum element in the list
    * @throws NullPointerException if list is null or
    *         if any list elements are null
    * @throws ClassCastException if list elements are not mutually comparable
    * @throws IllegalArgumentException if list is empty
    */
	public static int lastzero (int[] x){
		/**
		* Find LAST index of zero
		*
		* @param x array to search
		* @return index of last 0 in x; -1 if absent
		* @throws NullPointerException if x is null
		*/
		for (int i = 0; i < x.length; i++){
			if (x[i] == 0){
				return i;
			}
		}
		return -1;

	}
	public static int lastzeroCorrect (int[] x){
		/**
		* Find LAST index of zero
		*
		* @param x array to search
		* @return index of last 0 in x; -1 if absent
		* @throws NullPointerException if x is null
		*/
		for (int i = x.length-1; i >= 0; i--){
			if (x[i] == 0){
				return i;
			}
		}
		return -1;

	}	
}

