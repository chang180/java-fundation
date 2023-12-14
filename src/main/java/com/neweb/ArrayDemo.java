package com.neweb;

public class ArrayDemo {
    public static void main(String[] args) {
//        demo1();
        // 錯誤示範，2個變數指向同一個陣列
        int [] num1 = {1, 2, 3, 4, 5};
        int [] num2 = num1;
        num2[0] = 10; // num1[0] 也會變成 10
        System.out.println(num1[0]);

        // 正確示範，複製陣列
        int [] num3 = {1, 2, 3, 4, 5};
        int [] num4 = num3.clone();
        num4[0] = 10; // num3[0] 不會變成 10
        System.out.println(num3[0]);
    }

    private static void demo1() {
        int[] arr = new int[5];
        // 陣列賦值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        // 複製陣列
        int[] arr2 = arr.clone();
        // 陣列輸出
        for (int j : arr2) {
            System.out.println(j);
        }
        // 錯誤處理
        try {
            arr[0] = 1;
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            System.out.println(arr.length); // won't be executed because of the exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
