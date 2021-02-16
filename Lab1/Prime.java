package lab1;
import java.util.*; 
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   		Scanner s=new Scanner(System.in);
		   		System.out.println("Enter a number: ");
		   		int num=s.nextInt();
		   		for(int i=2;i<num;i++)
		   		{
		   			int b=0;
		   			for(int j=2;j<i;j++)
		   			{
		   				if(i%j==0)
		   				b=1;
		   			}
		   			if(b==0)
		   				System.out.println(i);
		   		}
		   	}
		   
	}


