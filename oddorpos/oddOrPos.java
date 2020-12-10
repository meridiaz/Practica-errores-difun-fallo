
import java.util.*;
import java.lang.Math;

public class oddOrPos
{
	 /**
	* Count odd or positive elements in an array
	*
	* @param x array to search
	* @return count of odd or positive elements in x
	* @throws NullPointerException if x is null
	*/
	public static int oddorpos (int[] x){
		int count = 0;
		for (int i = 0; i < x.length; i++){
			/*System.out.println("en oddorpos fuera del if"+x[i]+'\n'+(x[i]%2 == 1 || x[i] > 0));
			System.out.println("en oddorpos fuera del if"+x[i]+'\n'+(x[i]%2 == 1 ));
			System.out.println("en oddorpos fuera del if"+x[i]+'\n'+(x[i]%2));*/
			if (x[i]%2 == 1 || x[i] > 0){
				count++;
			}
		}
		return count;
	}
	public static int oddorposCorrect (int[] x){
		int count = 0;
		for (int i = 0; i < x.length; i++){
			if ((Math.abs(x[i]))%2 == 1 || x[i] > 0){
				count++;
			}
		}
		return count;
	}
}

