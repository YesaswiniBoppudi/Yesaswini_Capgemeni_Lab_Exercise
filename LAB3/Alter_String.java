package lab2;
import java.util.Scanner;
public class Alter_String {
	public String Rep_consts(String x)
    {
           StringBuffer y = new StringBuffer(x);
           for(int i=0;i<x.length();i++)
           {
                  char ch = y.charAt(i);
                  if(!(ch == 'A' || ch =='a' || ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u'||ch=='E'||ch=='e'))
                  {
                        y.replace(i,i+1,String.valueOf((char)(ch+1)));
                  }
           }
           return y.toString();
    }
	public static void main(String[] args) {
		Alter_String p = new Alter_String();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        String x = s.next();
        System.out.println(p.Rep_consts(x));
	}

}
