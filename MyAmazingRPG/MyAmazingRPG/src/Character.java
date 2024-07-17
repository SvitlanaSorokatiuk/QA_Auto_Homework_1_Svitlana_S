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

    public void attack(Character other) {
        other.takeDamage(this.strength - other.defense);
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            this.health -= damage;
        }
    }

    public boolean isAlive() {
       return health > 0;
    }
        public void displayStatus() {
            System.out.println("Герой " + name + " " + "Здоров’я: " + health + " " + "Сила: " + strength + " " + "Захист: " + defense);
        }
    }