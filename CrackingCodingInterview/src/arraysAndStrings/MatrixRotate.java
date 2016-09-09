package arraysAndStrings;

public class MatrixRotate {
	public static int[][] rotate(int[][] mat, int n) {
		for (int layer = 0; layer < n / 2; layer++) {
			int f = layer;
			int l = n - 1 - layer;
			for (int i = f; i < l; i++) {
				int offset = i - f;
				int top = mat[f][i];
				mat[f][i] = mat[l - offset][f];
				mat[l - offset][f] = mat[l][l - offset];
				mat[l][l - offset] = mat[i][l];
				mat[i][l] = top;
			}

		}
		return mat;
	}

	public static void main(String[] args) {
		int[][] mat = { { 20, 18, 22, 20 }, { 181, 120, 218, 321 },
				{ 163, 318, 516, 520 }, { 253, 424, 422, 224 } };
		int n = 4;

		mat = rotate(mat, 4);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}
}
