package Seminar_1;
/**

// import java.math.BigInteger;
// import java.time.LocalTime;
// import java.util.Arrays;
// import java.util.Scanner;
 */

public class HW_sem_1 {
    public static void main(String[] args) {
        hw2();
    }

    static void hw2() {
        /**
        // int n = 1000;
        // for (int i = 1; i <= n; i++) {
        //     BigInteger bigInteger = BigInteger.valueOf(i);
        //     boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(i));
        //     if (probablePrime == true) {
        //         System.out.println(i);
        //     }
        // }
         */
        int n = 1000;
        int num;
        for (int i = 1; i <= n; i++) {
            num = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    num ++;
                }
            }
            if (num == 0) {
                System.out.println(i);
            }
        }
    }
}