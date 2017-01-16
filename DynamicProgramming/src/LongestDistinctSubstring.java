public class LongestDistinctSubstring {
    public int lengthOfLongestSubstring(String s) {
        s=s.toLowerCase();
           int[] chars=new int[256];
           int curr=0;
           int max=0;
           for(int i=0;i<s.length();i++){
                if(chars[s.charAt(i)-'a']==1){
                    max=Math.max(curr,max);
                    curr=1;
                }else{
                    chars[s.charAt(i)-'a']=1;
                    curr++;
                }
           }
           return max;
    }
}