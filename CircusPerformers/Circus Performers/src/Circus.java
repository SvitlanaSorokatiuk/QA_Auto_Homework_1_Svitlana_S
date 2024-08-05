import java.util.ArrayList;

public class Circus<T> {
    private ArrayList<T> performers = new ArrayList<>();

    public void addPerformer (T performer) {
        this.performers.add(performer);
    }

    public void removePerformer (T performer) {
        this.performers.remove(performer);
    }

    public ArrayList<T> listPerformers() {
        return new ArrayList<>(performers);
    }


}
