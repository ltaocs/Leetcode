package lt;

/**
 * Created by Lin Tao on 5/30/2017.
 */
public class L413 {
    public static int numberOfArithmeticSlices(int[] A) {
        int count = 0;
        //int[] NewA = {A.length};
        int[] NewA = new int[A.length];
        int NewAElement = 0;
        for (int i = 0; i < A.length - 1; i++) {
            int a = i + 1;


            NewA[NewAElement] = A[i] - A[a];
            NewAElement++;

        }
        for (int i = 0; i < NewA.length - 1; i++) {
            for (int j = i+1; j < NewA.length ; j++) {
                if (NewA[i] == NewA[j]) {
                    count++;


                    j++;

                }


            }
        }
        System.out.println(count);

        return count;
    }
}
