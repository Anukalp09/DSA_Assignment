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
		long a = sc.nextLong();
		int b = sc.nextInt();
		System.out.println(power(a, b));
	}
	public static long power(long a, int b) {
		if (b == 0) return 1;
		return a * power(a, b - 1);
	}
}
