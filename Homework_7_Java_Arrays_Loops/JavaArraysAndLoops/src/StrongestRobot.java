public class StrongestRobot {
    public static void main(String[] args) {
        int [] weights = {300, 450, 200, 500, 350};
        int strongestRobot = 0;
        int maxWeight = 0;

        for (int i = 0; i < weights.length; i++) {
            if (maxWeight < weights[i]) {
                maxWeight = weights[i];
                strongestRobot = i+1;
                            }
            else if (maxWeight == weights[i]) {
                System.out.println("Не можливо визначити переможця. Два чи більше роботи підняли однакову вагу");
                return;
            }
            else {
                continue;
            }
        }
        System.out.println("Найсильнійший робот під номером " + strongestRobot + ", який підняв найбільшу вагу " + maxWeight);

    }
}
