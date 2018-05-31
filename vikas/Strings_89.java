import java.util.Scanner;

public class Strings_89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int k = scn.nextInt();

		char[] res = (palindrome_kdigits(str, k));
		for (int i = 0; i < str.length(); i++) {
			System.out.print(res[i]);
		}
	}

	public static char Max(char a, char b) {
		int x = (int) a;
		int y = (int) b;
		int max = Math.max(x, y);
		char r = (char) max;
		return r;

	}

	private static char[] palindrome_kdigits(String str, int k) {
		int left = 0;
		int right = str.length() - 1;
		char[] pal = new char[str.length()];
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				char ch = Max(str.charAt(left), str.charAt(right));
				pal[left] = pal[right] = ch;
				k--;
			}
			left++;
			right--;
		}
		left = 0;
		right = str.length() - 1;

		while (left <= right) {

			if (left == right) {
				if (k > 0) {
					pal[left] = '9';
				}
			}

			if (pal[left] < '9') {

				if (k >= 2 && pal[left] == str.charAt(left) && pal[right] == str.charAt(right)) {
					k -= 2;
					pal[left] = pal[right] = '9';
				}

				else if (k >= 1 && (pal[left] != str.charAt(left) || pal[right] != str.charAt(right))) {
					k--;
					pal[left] = pal[right] = '9';
				}
			}
			left++;
			right--;
		}

		return pal;

	}

}
