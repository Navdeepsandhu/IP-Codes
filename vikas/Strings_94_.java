import java.util.Scanner;

public class Strings_94_ {

	static int Cwords(String str, int len) {
		int count = 1;
		// We are taking count as the total no. of subsequences formed
		// till now.
		if (len == 1)
			return count;

		// if first and second element are equal.
		// count would be 1.
		if (str.charAt(0) == str.charAt(1))
			count *= 1;
		else

			count *= 2;
		// there are three cases,
		// suppose the input string is "abc"
		// options available for b are a,b and c i.e. three .
		// for string "aab" options for a in middle are only two i.e. 'a' and 'b'.
		for (int j = 1; j < len - 1; j++) {
			// if all are equal
			if (str.charAt(j) == str.charAt(j - 1) && str.charAt(j) == str.charAt(j + 1))
				count *= 1;
			// if(if two of them are equal.
			else if (str.charAt(j) == str.charAt(j - 1) || str.charAt(j) == str.charAt(j + 1)
					|| str.charAt(j - 1) == str.charAt(j + 1))
				count *= 2;
			// oif all are distinct.
			else
				count *= 3;
		}

		if (str.charAt(len - 1) == str.charAt(len - 2))
			count *= 1;
		else
			count *= 2;

		return count;
	}

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int len = str.length();
		System.out.println(Cwords(str, len));
	}
}
