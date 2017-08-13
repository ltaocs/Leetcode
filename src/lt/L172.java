package lt;

public class L172 {
	public int trailingZeroes(int n) {
		int count=0;
		for(int i = 0; i<=n;i++){
			if (i%5==0){
                count ++;

			}
		}
		return count;

	}

}
