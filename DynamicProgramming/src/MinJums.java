
public class MinJums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int n = arr.length;
		System.out.println("Minimum number of jumps to reach end is  " + dynamicSecond(arr, 0, n-1));
		
	}
	
	//dynamic approach 1
	public static int minJumpsDynamic(int[] arr, int s, int e){
		if(s==e)
			return 0;
		// to store minimum jumps to reach i
		int[] min_jumps = new int[e+1];
		min_jumps[0]=0;
		for(int i=1;i<=e;i++){
			//initialize to max;
			min_jumps[i]=Integer.MAX_VALUE;
			//loop from 0 to i-1 to check the min jumps
			for(int j=0;j<i;j++){
				//check if reachable from j
				if(i<=j+arr[j]){
					if(min_jumps[j]!=Integer.MAX_VALUE){
						min_jumps[i]=Math.min(min_jumps[i], min_jumps[j]+1);
					}
				}
			}
		}
		return min_jumps[e];
		
	}
	
	//dynamic approach 2 
	public static int dynamicSecond(int[] arr, int s, int e){
		int min_jumps[] = new int[e+1];
		
		min_jumps[e]=0; //as already reached
		
		for(int i=e-1;i>=0;i--){
			if(arr[i]==0) {
				min_jumps[i]=Integer.MAX_VALUE;
				
			}
			else if(arr[i]>=e-i){
				min_jumps[i]=1;
				
			}
			else{
			min_jumps[i]=Integer.MAX_VALUE;
			//check minimum for all reachable points and add 1 to it
			for(int j=i+1;j<=e && j<=i+arr[i];j++){
				if(min_jumps[j]!=Integer.MAX_VALUE){
					min_jumps[i]=Math.min(min_jumps[i], min_jumps[j]+1);
				}
			}
			}
		}
		return min_jumps[0];
		
	}
	
	//recursive non dynamic approach
	public static int minJumps(int[] arr, int s, int e){
		if(s==e){
			return 0;
		}
		if(arr[s]==0){
			return Integer.MAX_VALUE;
		}
		int min=Integer.MAX_VALUE;
		for(int i=s+1;i<=e && i<=s+arr[s]; i++){
			int jump = minJumps(arr,i,e);
			if(jump+1<min && jump!=Integer.MAX_VALUE){
				min=jump+1;
			}
			
		}
		return min;
	}

}
