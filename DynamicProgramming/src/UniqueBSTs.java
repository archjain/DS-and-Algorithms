
public class UniqueBSTs {
	
	    public int numTrees(int n) {
	        int[] arr = new int[n];
	        return bsts(n,arr);
	    }
	    public static int bsts(int n, int[] arr){
	        if(n==0 || n==1)
	            return 1;
	        int count=0;
	        for(int i=0;i<n;i++){
	            if(arr[i]==0){
	                arr[i]=bsts(i,arr);
	             
	            }
	            if(arr[n-1-i]==0){
	                arr[n-1-i]=bsts(n-1-i,arr);
	            }
	            count+=arr[i]* arr[n-1-i];
	        }
	        return count;
	        
	    
	}
}
