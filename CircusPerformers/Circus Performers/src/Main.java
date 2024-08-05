import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CircusPerformer artist1 = new CircusPerformer("Джон", "клоун", 10);

        Circus <String> myCircus = new Circus<>();
        myCircus.addPerformer("Acrobat");
        myCircus.addPerformer("Clown");
        myCircus.addPerformer("Juggler");

        System.out.print("\nСписок акторів цирку:");
        for (String performer : myCircus.listPerformers()) {
            System.out.print(" " + performer);
        }
        }
}