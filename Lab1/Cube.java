package lab1;
import java.util.*;
import java.lang.*;
class Cube {
         public static int CubicSum(int x) 
		    { 
		        int sum = ((x*(x+1))/2); 
		        return sum*sum; 
		    }  
		    public static void main(String[] args) 
		    { 
		        int x = 5; 
		        System.out.println(CubicSum(x)); 
		  
		    }  
	      }