public class WaterIntakeTracker {
    public static void main(String[] args) {
        int[] waterIntake = {3, 1, 4, 2, 0, 5, 2};
        int sum = 0;

        int i = 0;
        while (i < waterIntake.length) {
            if (waterIntake[i] >=2) {
                sum = sum + waterIntake[i];
            }
                i++;
        }
        System.out.println("Сумарна кількість випитих склянок води за тиждень: " + sum);

    }
}
