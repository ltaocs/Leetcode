package lt;

public class L507 {
	public static boolean checkPerfectNumber(int num) {
		//int total=divisor(num);
		
		int[] DSet = new int[6];
		int j=0;
		int sum=0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				DSet[j]=i;
				j++;

			}
		}
		for (int i : DSet){
			sum+=i;
		}
		
		
		
		if(sum==num)
			return true;
		else
			return false;

	}

	/*public static int divisor(int n) {
		int[] DSet = new int[100];
		int j=0;
		int sum=0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				DSet[j]=i;
				j++;

			}
		}
		for (int i : DSet){
			sum+=i;
		}

		return sum;

	}*/

}
