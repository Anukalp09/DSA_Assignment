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
		System.out.println(reverse(s, s.length() - 1));
	}
	public static String reverse(String s, int i) {
		if (i < 0) return "";
		return s.charAt(i) + reverse(s, i - 1);
	}
}
