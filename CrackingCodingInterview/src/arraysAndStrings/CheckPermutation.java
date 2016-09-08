package arraysAndStrings;

public class CheckPermutation {
	public static boolean isPermuation(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		int[] charCount = new int[26];
		for (int i = 0; i < str1.length(); i++) {
			charCount[str1.charAt(i) - 'a']++;
		}
		for (int i = 0; i < str2.length(); i++) {
			charCount[str2.charAt(i) - 'a']--;
		}
		for (int i = 0; i < 26; i++) {
			if (charCount[i] > 0)
				return false;
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPermuation("archit","tichar"));
		System.out.println(isPermuation("archit","ticbar"));
	}

}
