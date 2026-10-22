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
		int n = sc.nextInt();
		printFibonacci(n, 0, 1);
	}
	public static void printFibonacci(int n, long a, long b) {
		if (n <= 0) return;
		System.out.print(a);
		if (n > 1) System.out.print(" ");
		printFibonacci(n - 1, b, a + b);
	}
}
