package lt;

/**
 * Created by Lin Tao on 6/4/2017.
 */
public class L605 {
    public static boolean
    canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            count++;
        } else {


            for (int i = 0; i < flowerbed.length; i++) {


                if (i == 0 && flowerbed[0] == 0 && flowerbed[1] == 0) {
                    count++;
                    flowerbed[0] = 1;
                } else if (i == flowerbed.length - 1 && flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
                    count++;
                    flowerbed[flowerbed.length - 1] = 1;
                } else {
                    if (i != 0 && i != flowerbed.length - 1) {
                        int i1 = i - 1;
                        int i2 = i + 1;
                        if (flowerbed[i] == 0 && flowerbed[i1] == 0 && flowerbed[i2] == 0) {
                            count++;
                            flowerbed[i] = 1;
                        }

                    }
                }
            }
        }


        return count >= n ? true : false;


    }
}
