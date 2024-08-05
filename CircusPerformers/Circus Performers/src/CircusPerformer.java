public class CircusPerformer {
    private String name;
    private String act;
    private int experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public CircusPerformer (String name, String act, int experience) {
        try {
            validateExperience(experience);
            this.name = name;
            this.act = act;
            this.experience = experience;
            System.out.print("\nНового артиста " + name + "\nз вивом виступу " + act + "\nз досвідом " + experience + " років \nуспішно додано до цирку");
           } catch (InvalidExperienceException e) {
            throw new RuntimeException(e);
        }

    }

    public void validateExperience (int experience) throws InvalidExperienceException {
        if (experience > 0 && experience < 50) {
            System.out.print("Артист має необхідний досвід");
        } else {
            throw new InvalidExperienceException("Досвід артиста не може бути менше 0 або більше 50 років");
        }
    }

}
