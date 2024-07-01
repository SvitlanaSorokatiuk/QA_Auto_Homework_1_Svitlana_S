import java.util.Scanner;
public class StudentSearch {
    public static void main(String[] args) {
        int[] studentIDs = {12345, 67890, 54321, 98765, 24680};

        // Вводимо номер залікової книжки
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер залікової книжки: ");
        int gradebook = scanner.nextInt();

        // Перевіряємо номер залікової книжки
        for (int i: studentIDs) {
            if (i == gradebook) {
                System.out.println("Знайдено студента за номером залікової книжки " + i);
                return;
            }
            else  {
             continue;
         }
              } System.out.println("Студента за вказаним номером залікової книжки НЕ знайдено");
    }
}




