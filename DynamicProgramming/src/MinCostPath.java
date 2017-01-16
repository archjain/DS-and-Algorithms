
import java.util.*;

class MinimumCostPath
{
	

	private static int minCost(int cost[][], int m, int n)
	{
	    m=m+1;
	    n=n+1;
	    int[][] pc = new int[m][n];
	    pc[0][0] = cost[0][0];
	    for(int i=1;i<m;i++){
	        pc[i][0]=pc[i-1][0]+cost[i][0];
	    }
	    for(int j=1;j<n;j++){
	        pc[0][j]=pc[0][j-1]+cost[0][j];
	    }
	    for(int i=1;i<m;i++){
	        for(int j=1;j<n;j++){
	            pc[i][j]=Math.min(pc[i-1][j],Math.min(pc[i-1][j-1],pc[i][j-1]))+cost[i][j];
	            System.out.println(pc[i][j]);
	        }
	    }
	    return pc[m-1][n-1];
	    
	    
	}

	
	public static void main(String args[])
	{
		int cost[][]= {{1, 2, 3},
					{4, 8, 2},
					{1, 5, 3}};
		System.out.println("minimum cost to reach (2,2) = " +
										minCost(cost,2,2));
	}
}

