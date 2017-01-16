
public class Knapsack {
	public static int getMaxBen(int[] wts, int[] ben, int n,int w){
		if(w==0 || n==wts.length)
			return 0;
		if(wts[n]>w)
			return getMaxBen(wts,ben,n+1,w);
		int incl_ben=getMaxBen(wts,ben,n+1,w-wts[n])+ben[n];
		int excl_ben=getMaxBen(wts,ben,n+1,w);
		return Math.max(incl_ben,excl_ben);
		
		
	}
	public static void main(String[] args){
		int[] wts={2,2,4,5};
		int[] ben={3,7,2,9};
		System.out.println(getMaxBen(wts,ben,0,10));
	}
}
