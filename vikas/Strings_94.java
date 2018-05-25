import java.util.Scanner;

public class Strings_94 {

	public static Boolean isPalindrome(String str) {
		int n = str.length();

		for (int i = 0; i < n / 2; i++)
			if (str.charAt(i) != str.charAt(n - i - 1))
				return false;

		return true;
	}

	public static int MaxL(String str) {
		int n = str.length();
		char ch = str.charAt(0);

		int i = 1;
		for (i = 1; i < n; i++)
			if (str.charAt(i) != ch)
				break;

		if (i == n)
			return 0;

		if (isPalindrome(str))
			return n - 1;

		return n;
	}

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(MaxL(str));
	}
}