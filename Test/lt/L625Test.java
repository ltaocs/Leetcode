package lt;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Lin Tao on 6/17/2017.
 */
public class L625Test {
    @org.junit.Test
    public void smallestFactorization() throws Exception {
        int a0=48;
        L625 l0 = new L625();
        int result0=l0.smallestFactorization(a0);

        int a1=15;
        L625 l1 = new L625();
        int result1=l1.smallestFactorization(a1);

        int a2=1;
        L625 l2 = new L625();
        int result2=l1.smallestFactorization(a2);

        int a3=2;
        L625 l3 = new L625();
        int result3=l1.smallestFactorization(a3);

        int a4=18;
        L625 l4 = new L625();
        int result4=l4.smallestFactorization(a4);

        int a5=11;
        L625 l5 = new L625();
        int result5=l5.smallestFactorization(a5);

        int a6=128;
        L625 l6 = new L625();
        int result6=l6.smallestFactorization(a6);

        int a7=1024;
        L625 l7 = new L625();
        int result7=l7.smallestFactorization(a7);

        int a8=10000;
        L625 l8 = new L625();
        int result8=l8.smallestFactorization(a8);

        //18000000
        int a9=18000000;
        int result9=l0.smallestFactorization(a9);

        int a10=800;
        int result10=l0.smallestFactorization(a10);



        assertEquals(68,result0);
        assertEquals(35,result1);
        assertEquals(1,result2);
        assertEquals(29,result4);
        assertEquals(288,result6);
        assertEquals(2888,result7);
        assertEquals(255558,result8);
        //assertEquals(255,result9);
        assertEquals(4558,result10);
    }

}