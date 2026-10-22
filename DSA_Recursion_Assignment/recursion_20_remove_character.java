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
		char c = sc.next().charAt(0);
		System.out.println(removeCharacter(s, c, 0));
	}
	public static String removeCharacter(String s, char c, int i) {
		if (i == s.length()) return "";
		if (s.charAt(i) == c) {
			return removeCharacter(s, c, i + 1);
		}
		return s.charAt(i) + removeCharacter(s, c, i + 1);
	}
}
