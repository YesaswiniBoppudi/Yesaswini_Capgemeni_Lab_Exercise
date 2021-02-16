package lab2;
import java.util.*;
import java.io.*;
public class Displayncl {

	public static void main(String[] args)throws IOException {
		 int xl=1,xw=0; char ch;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("\nEnter File name: ");
		 String str=sc.nextLine();
		 FileInputStream f=new FileInputStream(str);
         int n=f.available();
         for(int i=0;i<n;i++)
         {
            ch=(char)f.read();
            if(ch=='\n')
               xl++;
            else if(ch==' ')
               xw++;
                                                        
         }
         System.out.println("\nNumber of lines : "+xl);
         System.out.println("\nNumber of words : "+(xl+xw));
         System.out.println("\nNumber of characters : "+n);
                               

		            }	

	}
