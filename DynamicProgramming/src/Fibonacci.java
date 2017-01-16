import java.util.ArrayList;


public class Fibonacci {

	//without using DS
	/*
	 * initialize n1 and n2 to 1
	 * from i = 2 to i<n
	 * keep adding n1 and n2 to get n3 and then assign n1=n2 and n2=n3
	 * 
	 */
	public int fib(int n){
		int n1 = 1;
		int n2 = 1;
		int i=2;
		int n3 = 0;
		while(i<n){
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			i++;
		}
		return n2;
				
	}
	
	//with DS
	/*Steps
	 * Initalize arr of size n+1 with -1;
	 * initialize arr[0]=0 and arr[1]=1
	 * now in function check if arr[n]==-1
	 * if yes, call recursively arr[n] = fib(n-1)+fib(n-2)
	 * else, arr[n] has got the required answer, return it
	 * 
	 */
	public int fib2(int n, int[] arr){
		if(arr[n]==-1)
			arr[n]=fib2(n-1,arr)+ fib2(n-2,arr);
		return arr[n];
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci obj = new Fibonacci();
		int n = 6;
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2;i<n+1;i++){
			arr[i]=-1;
		}
		System.out.println(obj.fib2(n, arr));
		Fibonacci obj2 = new Fibonacci();
		System.out.println(obj2.fib(n));
	}

}
