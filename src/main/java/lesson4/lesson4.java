package lesson4;


import java.util.Arrays;

import static lesson4.Util.sum;

public class lesson4 {
    public static void main(String[] args) {
        int[] arrays = {1, -10, -18, 44, 2, 8, 5, 13, -70, 6, 9};
        int summary = sum(arrays);
        System.out.println("SUM: " + summary);
        Util.positivePrint(arrays);
    }
}

