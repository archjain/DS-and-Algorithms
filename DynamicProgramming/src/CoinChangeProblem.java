public class CoinChangeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int arr[] = { 1, 2, 3 };
		int m = arr.length;
		System.out.println(coin_dynamic(arr, m, 4));

	}

	// recursive
	public static int coint_count(int[] arr, int m, int amount) {
		if (amount == 0)
			return 1;
		if (amount < 0)
			return 0;
		if (amount > 0 && m <= 0)
			return 0;
		return coint_count(arr, m - 1, amount)
				+ coint_count(arr, m, amount - arr[m - 1]);
	}

	// dynamic approach
	public static long coin_dynamic(int[] arr, int m, int amount) {
		long[] sols = new long[amount + 1];
		// if amount is zero, then there is onw way
		sols[0] = 1;

		for (int i = 0; i < m; i++) {
			for (int j = arr[i]; j <= amount; j++) {
				sols[j] = sols[j] + sols[j - arr[i]];
			}
		}
		return sols[amount];

	}

}
