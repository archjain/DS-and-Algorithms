package arraysAndStrings;

/*To determine if the string has all unique characters */

public class IsUnique {

	//with the help of array
	public static boolean checkUniqueWithDS(String str){
		
		int[] charcount = new int[26];
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++){
			charcount[str.charAt(i)-'a']++;
			if(charcount[str.charAt(i)-'a']>1)
				return false;
		}
		return true;
	}
	
	//without using array
	public static boolean checkUniqueWithoutDS(String str){
		 int checker = 0;
		    for (int i = 0; i < str.length(); i++) {
		        int val = str.charAt(i) - 'a';
		        if ((checker & (1 << val)) > 0) return false;
		        //sets the character bit 
		        checker = checker | (1 << val);
		    }
		    return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println(IsUnique.checkUniqueWithDS("archit"));
				System.out.println(IsUnique.checkUniqueWithDS("architr"));
				System.out.println("************");
				System.out.println(IsUnique.checkUniqueWithoutDS("archit"));
				System.out.println(IsUnique.checkUniqueWithoutDS("architr"));
	}

}
