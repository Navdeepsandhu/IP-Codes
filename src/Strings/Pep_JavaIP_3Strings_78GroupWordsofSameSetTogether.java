package Strings;
/*
18
may student students dog
studentssess god cat act tab
bat flow wolf lambs amy yam
balms looped poodle*/

/*student students studentssess 
tab bat 
cat act 
lambs balms 
may amy yam 
looped poodle 
dog god 
flow wolf*/

/*5
navdeep vandeep pnavdee sumeet meetsu 
//navdeep vandeep pnavdee 
sumeet meetsu*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Pep_JavaIP_3Strings_78GroupWordsofSameSetTogether {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String[] arr = new String[scn.nextInt()];

		HashMap<String, ArrayList<String>> map = new HashMap();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.next();
			developHasmap(arr[i], map);
		}
		ArrayList<String> wordsmap = new ArrayList<>(map.keySet());

		for (String word : wordsmap) {

			for (String similarword : map.get(word)) {
				System.out.print(similarword + " ");
			}
			System.out.println();
		}

	}

	private static void developHasmap(String word, HashMap<String, ArrayList<String>> map) {
		boolean[] fmap = new boolean[26];
		for (int i = 0; i < word.length(); i++) {
			fmap[word.charAt(i) - 'a'] = true;
		}
		String unique_characterset = "";
		for (int i = 0; i < 26; i++) {
			if (fmap[i] == true) {
				unique_characterset += (char) (i + 'a');
			}
		}
		ArrayList<String> patterns = new ArrayList<>();
		if (map.containsKey(unique_characterset) == true) {
			patterns = map.get(unique_characterset);
			patterns.add(word);
		} else {
			patterns.add(word);
		}
		map.put(unique_characterset, patterns);
	}

}
