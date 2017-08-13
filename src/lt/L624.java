package lt;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Lin Tao on 6/17/2017.
 */
public class L624 {
    public int maxDistance(int[][] arrays) {
        //int[] sortArray=new int[20100];
        //int[] sortArray = new int[20100];
        List<Integer> list = new LinkedList<Integer>();

        int arrayElement = 0;
        int distance = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (j == 0 || j == arrays[i].length-1) {
                    //sortArray[arrayElement] = arrays[i][j];
                    //arrayElement++;
                    list.add(arrays[i][j]);
                }
            }
        }
        //Arrays.sort(sortArray);
        //distance = sortArray[sortArray.length - 1] - sortArray[0];

        Collections.sort(list);
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {



            }
        }



                distance=list.get(list.size()-1)-list.get(0);


        return distance;
    }
}
