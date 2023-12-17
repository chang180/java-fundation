package homework;

public class Unit35 {
    public static void main(String[] args) {
        // 倒轉整數值，輸入值為 -96463452，43713
        System.out.println(reverseDigit(-96463452));
        System.out.println(reverseDigit(43713));
    }

    private static int reverseDigit(int input) {
        int output = 0;
        int temp = 0;
        while (input != 0) {
            temp = input % 10;
            output = output * 10 + temp;
            input = input / 10;
        }
        return output;
    }
}
