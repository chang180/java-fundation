package homework;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Unit34 {
    public static void main(String[] args) {
        // 作業
        // 1. 列印 14 * 14 的矩陣
        answer1();

        // 2. 陣列加總 for 及 foreach
        answer2();
    }

    private static void answer2() {
        // 陣列加總 for 及 foreach
        //for answer
        int[] array = {3, 10, 18, 24};
        int sum1 = 0;
        for (int i : array) {
            sum1 += i;
        }
        System.out.println("for sum = " + sum1);

        // foreach answer
        AtomicInteger sum2 = new AtomicInteger();
        IntStream.of(array).forEach(sum2::addAndGet);
        System.out.println("foreach sum = " + sum2);
    }

    private static void answer1() {
        // 列印 14 * 14 的矩陣
        int n = 13;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][0] = i;
            arr[0][i] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                arr[i][j] = i * j;
            }
        }
        System.out.print("\t");
        for(int i : arr[1]) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int[] row : arr) {
            System.out.print(row[1] + "\t");
            for (int i : row) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
