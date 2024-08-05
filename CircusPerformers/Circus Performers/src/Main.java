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

        myCircus.saveToFile("performers.txt");
        myCircus.loadFromFile("performers.txt");

        System.out.print("\nСписок акторів цирку:");
        for (CircusPerformer performer : myCircus.listPerformers()) {
            System.out.print(performer);
        }


    }


}