package lab2;
import java.util.*;
public class StrToken {

	public static void main(String[] args) {
		int num;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter integers:");
        String sc = s.nextLine();
        StringTokenizer st = new StringTokenizer(sc, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            num = Integer.parseInt(temp);
            System.out.println(num);
            sum = sum + num;
        }
        System.out.println("sum of the integers is: " + sum);
        s.close();
	}

}
