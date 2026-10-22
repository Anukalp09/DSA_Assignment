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
		System.out.println(sumDigits(n));
	}
	public static long sumDigits(long n) {
		if (n == 0) return 0;
		return n % 10 + sumDigits(n / 10);
	}
}
