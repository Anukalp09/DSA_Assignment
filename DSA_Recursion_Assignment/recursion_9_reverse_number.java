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
		System.out.println(reverse(n, 0));
	}
	public static long reverse(long n, long result) {
		if (n == 0) return result;
		return reverse(n / 10, result * 10 + n % 10);
	}
}
