import java.util.Arrays;

public class MergeSort {

	public int[] sort(int[] A) {
		if (A.length <= 1) {
			return A;
		}
		int[] f = new int[A.length / 2];
		int[] s = new int[A.length - A.length / 2];
		for (int i = 0; i < f.length; i++) {
			f[i] = A[i];
		}
		int k = 0;
		for (int j = 0; j < s.length; j++) {
			s[j] = A[f.length + k];
			k++;
		}
		sort(f);
		sort(s);
		int[] O = merge(f, s, A);
		return O;
	}

	public int[] merge(int[] f, int[] s, int[] A) {
		int[] O = new int[A.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < f.length && j < s.length) {
			if (f[i] > s[j]) {
				A[k] = s[j];
				j++;

			} else {
				A[k] = f[i];
				i++;
			}
			k++;
		}
		if (i < f.length) {
			while (i < f.length) {
				A[k] = f[i];
				k++;
				i++;
			}
		} else {
			while (j < s.length) {
				A[k] = s[j];
				k++;
				j++;
			}
		}
		return A;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] A = { 1, 2, 3, 5, 2, 4, 6 };
		MergeSort m = new MergeSort();

		int[] X = m.sort(A);
		for (int i = 0; i < X.length; i++) {
			System.out.println(X[i]);
		}

	}

}
