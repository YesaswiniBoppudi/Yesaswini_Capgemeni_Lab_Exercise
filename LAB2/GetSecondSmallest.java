package lab2;
import java.util.*;
public class GetSecondSmallest {
public static int Smallest(int[] x,int Total) {
	Arrays.sort(x);
	return x[1];
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x[]= {1,2,3,4,5,5};
        System.out.println("Second Smallest number in array:"+Smallest(x,6));
	}

}
