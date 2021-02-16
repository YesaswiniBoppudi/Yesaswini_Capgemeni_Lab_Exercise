package lab2;
import java.util.Arrays;
import java.util.Collections;
public class ModifyAry {
	public static int remDuplicants(Integer x[],int y){
		 if (y==0 || y==1){  
	            return y;  
	        }  
	        int[] num = new int[y]; 
	        int j = 0;  
	        for (int i=0; i<y-1; i++){  
	            if (x[i] != x[i+1]){  
	                num[j++] = x[i];  
	            }  
	         }  
	        num[j++] = x[y-1];
	        
	          
	        for (int i=0; i<j; i++){  
	            x[i] = num[i];  
	        }  
	        return j;  
	    }  
	       
	    public static void main(String[] args) {  
	        Integer x[] = {2,5,7,3,7,5,11,2,18,3,3,4};  
	        Arrays.sort(x,Collections.reverseOrder());  
	        int l = x.length;  
	        l = remDuplicants(x, l);    
	        for (int i=0; i<l; i++)  
	           System.out.print(x[i]+" ");  
	    }  

	}