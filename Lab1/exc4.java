package lab1;
import java.io.*;
public class exc4 {
	     
	    static boolean isPowTwo(int num)
	    {
	        if (num == 0)
	            return false;
	         
	        while (num != 1)
	        {
	            if (num % 2 != 0)
	                return false;
	            num = num / 2;
	        }
	        return true;
	    } 
	    public static void main(String args[])
	    {
	        if (isPowTwo(32))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	    }
	}