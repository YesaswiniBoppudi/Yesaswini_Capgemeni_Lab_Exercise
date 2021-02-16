package lab1;

public class exercise1 {
	  static int sum (int n) {
		  int sn1,sn2,sn3;
		  sn1=((n/3)/2)*(2*3 + (n/3 - 1)*3);
		  sn2=((n/5)/2)*(2*5 + (n/5 - 1)*5);
		  sn3=((n/15)/2)*(2*15 + (n/15 - 1)*15);
		  return sn1+sn2-sn3;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		  
		  int n=12;
		  System.out.println(sum(n));
	}
     
}
