package homework;

// 計算複利
public class Unit14 {
    public static void main(String[] args) {
        double principal = 100000; // 本金
        double rate = 0.05; // 年利率
        int year = 10; // 年數
        double interest = calcInterest(principal, rate, year);
        System.out.println("本金 " + principal + " 元，年利率 " + rate * 100 + "%，" + year + " 年後的本利和為 " + interest + " 元");
    }

    public static double calcInterest(double principal, double rate, int year) {
        double interest = principal;
        for (int i = 0; i < year; i++) {
            interest *= (1 + rate);
        }
        return interest;
    }
}
