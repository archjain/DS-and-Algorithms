
/*Returns the number of pairs of integers(i,j) where j>i*/

public class InversionCount {

	public int count(int[] A) {
		if (A.length <= 1) {
			return 0;
		} else {
			int[] f = new int[A.length / 2];
			int[] s = new int[A.length - A.length / 2];
			for (int i = 0; i < f.length; i++) {
				f[i] = A[i];
			}
			int k = f.length;
			for (int j = 0; j < s.length; j++) {
				s[j] = A[k];
				k++;
			}
			count(f);
			count(s);
			int Z = splitInv(f, s, A);
			return Z;
		}
	}

	int c = 0;

	public int splitInv(int[] f, int[] s, int[] A) {

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < f.length && j < s.length) {
			if (f[i] <= s[j]) {
				A[k] = f[i];
				i++;
				k++;

			} else {
				A[k] = s[j];
				j++;
				k++;
				c = c + f.length - i;

			}
		}
		if (i < f.length) {
			while (i < f.length) {
				A[k] = f[i];
				i++;
				k++;

			}
		}
		if (j < s.length) {
			while (j < s.length) {
				A[k] = s[j];
				j++;
				k++;
			}
		}
		System.out.println(c);
		return c;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 6, 5, 4, 3, 2, 1 };
		InversionCount inv = new InversionCount();

		System.out.println(inv.count(A));
	}

}
