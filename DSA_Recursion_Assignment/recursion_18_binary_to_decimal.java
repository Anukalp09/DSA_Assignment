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
		String s = sc.next();
		System.out.println(binaryToDecimal(s, 0));
	}
	public static long binaryToDecimal(String s, int i) {
		if (i == s.length()) return 0;
		return (s.charAt(i) - '0') * power(2, s.length() - 1 - i)
				+ binaryToDecimal(s, i + 1);
	}
	public static long power(long a, int b) {
		if (b == 0) return 1;
		return a * power(a, b - 1);
	}
}
