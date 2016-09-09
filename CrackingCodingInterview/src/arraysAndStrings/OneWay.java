package arraysAndStrings;

public class OneWay {
	public static boolean isEditOne(String str1, String str2){
		if(Math.abs(str1.length()-str2.length())>1)
			return false;
		int len = Math.max(str1.length(),str2.length());
		int changeCount = 0;
		int i=0;
		int j=0;
		while(i<str1.length() && j<str2.length()){
			if(str1.charAt(i)!=str2.charAt(j)){
				if(Math.abs(str1.length()-str2.length())>0){
					changeCount++;
					if(str1.length()>str2.length()){
						i++;
					}else j++;
					
				}else{
					changeCount++;
					i++;
					j++;
				}
			}else{
				i++;
				j++;
			}
			if(changeCount>1) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isEditOne("pale","ple"));
		System.out.println(isEditOne("pale","pade"));
		System.out.println(isEditOne("pale","pale"));
		System.out.println(isEditOne("pales","pale"));
		System.out.println(isEditOne("pale","pne"));
		System.out.println(isEditOne("pale","nane"));
	}

}
