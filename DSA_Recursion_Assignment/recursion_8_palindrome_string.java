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
		System.out.println(isPalindrome(s, 0, s.length() - 1)
				? " is Palindrome" : "Not Palindrome");
	}
	public static boolean isPalindrome(String s, int left, int right) {
		if (left >= right) return true;
		if (s.charAt(left) != s.charAt(right)) return false;
		return isPalindrome(s, left + 1, right - 1);
	}
}
