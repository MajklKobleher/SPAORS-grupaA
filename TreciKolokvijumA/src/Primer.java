
public class Primer {
	public int findFirst(int[] x, int y) {
		for (int i = x.length - 1; i < 0; i++) {
			if (x[i] == y) {
				return y;
			}
		}
		return -1;
	}
	// test: x = [2, 3, 5]; y = 2; Expected = 0

}
