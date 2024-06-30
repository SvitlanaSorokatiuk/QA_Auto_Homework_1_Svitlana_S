import java.util.Scanner;
public class CoffeShop {
    public static void main(String[] args) {
       // Вводимо кількість кожного напою
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість еспресо: ");
        int espresso = scanner.nextInt();
        System.out.println("Введіть кількість лате: ");
        int latte = scanner.nextInt();
        System.out.println("Введіть кількість капучіно: ");
        int cappuccino = scanner.nextInt();

        // Рахуємо вартість по кожному виду напою
       int costOfEspresso = espresso * 3;
       int costOfLatte = latte * 4;
       int costOfCappuccino = cappuccino * 5;

        // Рахуємо загальну суму замовлення
       int sum = costOfEspresso + costOfLatte + costOfCappuccino;
       System.out.println("Вартість Вашого замовлення складає " + sum + " доларів");

        // Варіант розрахунку загальної суми замовлення без введення додаткових змінних
        // int sum = 3 * espresso + 4 * latte + 5 * cappuccino;
        // System.out.println("Вартість Вашого замовлення складає " + sum + " доларів");
    }
}
