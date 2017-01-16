import java.util.*;
import java.util.Scanner;


public class DistinctBinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int end0 = 1;
		int end1 = 1;
		for(int i=1;i<n;i++){
			int temp=end0;
			end0=end0+end1;
			end1=temp;
			
		}
		System.out.println(end0+end1);
		
		
	}

}
