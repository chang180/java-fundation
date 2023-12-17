package homework;

public class unit37 {
    public static void main(String[] args) {
        // 心率強度表(心律強度 = (220 - 年齡 - 靜止心律) * 心律強度 + 靜止心律)

        // 1. 輸入年齡
        int age = 30;
        // 2. 輸入靜止心律
        int restingHeartRate = 65;
        // 3. 計算心律強度
        int intensity = 65;
        // 表列強度分別為 65%, 70&, 75%... 95%, 100% 時的心律
        double heartRate;
        do{
            heartRate = (220 - age - restingHeartRate) * intensity / 100.0 + restingHeartRate;
            System.out.println("心律強度為 " + intensity + "% 時，心律為 " + heartRate);
            intensity += 5;
        }while(intensity <= 100);
    }
}
