package lt;

public class L441 {
	public static int arrangeCoins(int n) {
		int i = 0;
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		} 
		else  {
			for (i = 0; i < n; i++) {
				int j = i * (i + 1) / 2;
				if (j < n) {
					continue;
				}
				else if (j == n) {
					return i;
				}
				break;
			}
			return --i;
		}
	}
}
