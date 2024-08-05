import java.io.*;
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

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (T performer : performers) {
                writer.write(performer.toString());
                writer.newLine();
            } System.out.print("\nСписок артистів збережено до файлу " + filename);
        } catch (IOException e) {
            System.out.print("\nПомилка запису файлу");
        }
    }

    public void loadFromFile(String filename) {
        performers.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split(", ");
                String name = parts[0].split(": ")[1];
                String act = parts[1].split(": ")[1];
                int experience = Integer.parseInt(parts[2].split(": ")[1].split(" ")[0]);

                performers.add((T) new CircusPerformer(name, act, experience));
            }
            System.out.print("\nЗавантажено список артистів з файлу " + filename);
        } catch (IOException e) {
            System.out.print("Помилка читання файлу");
        } catch (Exception e) {
            System.out.print("Помилка читання файлу");
        }
    }
    }

