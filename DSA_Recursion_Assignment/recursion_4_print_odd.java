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
		printOdd(1, n);
	}
	public static void printOdd(int i, int n) {
		if (i > n) return;
		System.out.print(i);
		if (i + 2 <= n) System.out.print(" ");
		printOdd(i + 2, n);
	}
}
