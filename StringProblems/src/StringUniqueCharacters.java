import java.util.ArrayList;
import java.util.Scanner;

//checks if string has all unique characters.
//returns false if all characters are not unique else true.
public class StringUniqueCharacters {

	public boolean isUnique(String str) {
		ArrayList list = new ArrayList();
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			if (!list.contains(str.charAt(i)))
				list.add(str.charAt(i));
			else {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		StringUniqueCharacters obj = new StringUniqueCharacters();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(obj.isUnique(str));

	}
}
