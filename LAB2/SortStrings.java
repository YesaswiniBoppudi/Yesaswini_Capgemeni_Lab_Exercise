package lab2;
import java.util.*;
public class SortStrings {

	public static void main(String[] args) {
			String [] a = {"Sunday","Monday","Tuesday","Wednesday","Thursday"};
			for(int i = 0;i<a.length;i++)
			{
			  System.out.println(a[i]);
			}
			Arrays.sort(a);
			System.out.println("After sort :");
			for(int i = 0;i<((a.length)/2)+1;i++)
			{
			  System.out.println(a[i].toUpperCase());
			}
			for(int i = 3;i<(a.length);i++)
			{
			  System.out.println(a[i].toLowerCase());
			}
		  }
		}


