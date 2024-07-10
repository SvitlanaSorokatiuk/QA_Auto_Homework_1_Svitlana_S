import static java.lang.System.*;

public class Character {

    static int characterCount;

    public Character() {
        characterCount++;
    }

    String name;
    int health;
    int strength;
    int defense;
    int damage;
    boolean isAlive;

    public void attack(Character other) {
        damage = strength - other.defense;
        if (damage < 0) {
            damage = 0;
        }
    }

    public void takeDamage(int damage) {
        health = health - damage;
    }

    public boolean isAlive() {
        if (health > 0) {
            isAlive = true;
            return true;
        } else {
            isAlive = false;
            return false;
        }
    }
        public void displayStatus() {
            System.out.println("Герой " + name + " " + "Здоров’я: " + health + " " + "Сила: " + strength + " " + "Захист: " + defense);
        }
    }



