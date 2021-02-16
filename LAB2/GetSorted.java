package lab2;
import java.util.*;
public class GetSorted {
          static void reversing(Integer n[])
          {
        	  Collections.reverse(Arrays.asList(n));
        	  Collections.sort(Arrays.asList(n));
        	  System.out.println(Arrays.asList(n));
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Integer [] a = {2,4,3,1,5};
         reversing(a);
         
	}

}
