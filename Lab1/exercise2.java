package lab1;

public class exercise2 {
	public static int sq_dif(int n) {
	     int sum_of_squares,sum,squaresum,dif ;
	       sum_of_squares = (n*(n+1)*((2*n)+1))/6;
	       sum = (n*(n+1))/2;
	       squaresum= (sum*sum);
           dif = Math.abs(sum_of_squares - squaresum);
           return dif;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int n = 15;
             System.out.println(sq_dif(n));
	}

}
