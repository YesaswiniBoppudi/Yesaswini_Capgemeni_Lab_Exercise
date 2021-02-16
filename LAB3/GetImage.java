package lab2;
import java.util.Scanner;

public class GetImage {
	public String Get_img(String x)
	{
	       StringBuffer y = new StringBuffer(x);
	       y.append('|');
	       StringBuffer z = new StringBuffer(x);
	       z.reverse();
	       y.append(z);
	       return y.toString();
	}
	public static void main(String[] args) {
		
		GetImage p = new GetImage();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = s.next();
        System.out.println(p.Get_img(str));
 }
	}
