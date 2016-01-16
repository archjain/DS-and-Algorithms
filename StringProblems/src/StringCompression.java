public class StringCompression {
	public String compress(String str) {
		if (str.length() == 1) {
			return str;
		}
		char currentChar = str.charAt(0);
		int count = 1;
		StringBuilder compStr = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == currentChar) {
				count++;
				if (i == str.length() - 1) {
					compStr.append(currentChar);
					compStr.append(count);
				}

			} else {
				compStr.append(currentChar);
				if (count > 1) {
					compStr.append(count);
				}
				count = 1;
				currentChar = str.charAt(i);
			}
		}
		return compStr.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompression obj = new StringCompression();
		String str = "aaccdeeefghhh";
		//output should be a3c2de3fgh3...no counting for single characters
		System.out.println(obj.compress(str));
	}

}
