package lt;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Lin Tao on 6/17/2017.
 */
public class L625 {
    public int smallestFactorization(int a) {
        int[] array =new int[50];
        int j = 0;
        String number="";
        int returnNumber = 0;
        if (a <= 9) {
            return a;
        }
        for (int i = 9; i > 1; i--) {
            while (a % i == 0) {
                array[j]=i;
                j++;
                a=a/i;
               // i=9;
            }
        }
        if (array[0] == 0) {
            return 0;
        }
        for (int i = j - 1; i >= 0; i--) {
             returnNumber += (int) (array[i]*Math.pow(10,i));
           // returnNumber= +tempNumber;


            //number += array[i];
        }
        //returnNumber=Integer.valueOf(number);
        //returnNumber=Integer.parseInt(number);
        return returnNumber;

    }
}

//wrong method
/*
    public int smallestFactorization(int a) {
        List<Integer> list = new LinkedList<Integer>();
        if (a <= 9) {
            return a;
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <= 9; j++) {
                for (int h = i; h <= 9; h++) {
                    for (int g = i; g <= 9; g++) {
                        if (i * j == a) {
                            list.add(10 * i + j);
                        }
                        if (i * j * h == a) {
                            list.add(100 * i + 10 * h + j);
                        }
                        if (i * j * h * g == a) {
                            list.add(1000 * i + 100 * h + 10 * g + j);
                        }
                    }
                }
            }
        }
        Collections.sort(list);
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return 0;
    }*/
