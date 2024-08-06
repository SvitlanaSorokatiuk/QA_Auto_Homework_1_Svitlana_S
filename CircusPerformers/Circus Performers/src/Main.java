import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Circus <CircusPerformer> myCircus = new Circus<>();
        myCircus.addPerformer(new CircusPerformer(" Кирило", "клоун", 10));
        myCircus.addPerformer(new CircusPerformer(" Катерина", "акробатка", 12));
        myCircus.addPerformer(new CircusPerformer(" Олександр", "жонглер", 5));

        System.out.print("\nСписок акторів цирку:");
        for (CircusPerformer performer : myCircus.listPerformers()) {
            System.out.print(performer);
        }

        //Збереження списку артистів у файл
        myCircus.saveToFile("performers.txt");
        //Завантаження списку артистів з файлу
        myCircus.loadFromFile("performers.txt");

        System.out.print("\nСписок акторів цирку:");
        for (CircusPerformer performer : myCircus.listPerformers()) {
            System.out.print(performer);
        }

        //Використання Reflection API для пошуку та виконання анотованих методів
        for (Method method : myCircus.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                int times = annotation.times();

                for (int i = 0; i < times; i++) {
                    try {
                        method.invoke(myCircus);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }


    }


}