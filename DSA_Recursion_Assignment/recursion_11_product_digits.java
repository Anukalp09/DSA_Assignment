/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(productDigits(n));
	}
	public static long productDigits(long n) {
		if (n == 0) return 0;
		if (n < 10) return n;
		return n % 10 * productDigits(n / 10);
	}
}
