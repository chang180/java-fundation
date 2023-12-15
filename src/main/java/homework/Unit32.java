package homework;

public class Unit32 {
    public static void main(String[] args) {
        int height = 170;
        int weight = 60;
        double bmi = bmi(height, weight);
        System.out.println(bmi);
    }

    // 計算BMI
    public static double bmi(double height, double weight) {
        return weight / Math.pow(height / 100, 2);
    }
}
