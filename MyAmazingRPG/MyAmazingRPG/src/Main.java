//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Character broccoli = new Character();

        broccoli.name = "Super Broccoli";
        broccoli.health = 50;
        broccoli.strength = 20;
        broccoli.defense = 30;

        Character spinach = new Character();

        spinach.name = "Magic Spinach";
        spinach.health = 50;
        spinach.strength = 30;
        spinach.defense = 10;

        do {
            spinach.attack(broccoli);
            broccoli.displayStatus();
            broccoli.isAlive();

            broccoli.attack(spinach);
            spinach.displayStatus();
            spinach.isAlive();
        } while (broccoli.isAlive() && spinach.isAlive());

        if (broccoli.isAlive() && !spinach.isAlive()) {
            System.out.println("Гру завершено. Виграв герой " + broccoli.name);
        } else if (!broccoli.isAlive() && spinach.isAlive()) {
            System.out.println("Гру завершено. Виграв герой " + spinach.name);
        } else if (!broccoli.isAlive() && !spinach.isAlive()){
            System.out.println("Гру завершено. Перемогла дружба");
        }

        System.out.println("-----------------------------");
        System.out.println("Загальна кількість стоворених героїв: " + Character.characterCount);

        }
    }



