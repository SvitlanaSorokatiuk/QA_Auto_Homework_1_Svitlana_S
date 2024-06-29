import java.util.Scanner;
public class Restaurant {
    public static void main(String[] args) {

        // Присвоюємо значення конкретної страви кожному типу страв
        String starter;
        starter = "Салат з авокадо";
        String mainCourse;
        mainCourse = "Борщ зі сметаною";
        String dessert;
        dessert = "Полуничне тірамісу";
        String drink;
        drink = "Карпатський чай";

        // Вводимо номер бажаного типу страви
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть, будь ласка, номер бажаного типу страви згідно наступної відповідності: " +
                "закуска - 1, основна страва - 2, десерт - 3, напій - 4");
        int typeOfDish = scanner.nextInt();

        // Виводимо назву страви у відповідності до обраного типу страви
        switch (typeOfDish) {
            case 1:
                System.out.println("Сьогодні у меню з обраного типу страви раді запропонувати Вам " + starter);
                break;
            case 2:
                System.out.println("Сьогодні у меню з обраного типу страви раді запропонувати Вам " + mainCourse);
                break;
            case 3:
                System.out.println("Сьогодні у меню з обраного типу страви раді запропонувати Вам " + dessert);
                break;
            case 4:
                System.out.println("Сьогодні у меню з обраного типу страви раді запропонувати Вам " + drink);
                break;
            default:
                System.out.println("Виберіть, будь ласка, номер типу страви з чотирьох доступних варіантів");
        }

    }
}
