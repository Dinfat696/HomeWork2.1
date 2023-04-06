public class Ravenclaw extends Hogwarts {
    private int mind;//ум
    private int wisdom;//мудрость
    private int wit;//остроумие
    private int creation;//творчесво

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
    public void studentInfo() {
        super.studentInfo();
        System.out.println(" Ум: " + mind + " Мудрость: " + wisdom + " Остроумие: " + wit + " Творчество: " + creation);

    }

    public static void compareStudents(Ravenclaw stud1, Ravenclaw stud2, Ravenclaw stud3) {
        int sum1 = stud1.getMind() + stud1.getWisdom() + stud1.getWit() + stud1.getCreation();
        int sum2 = stud2.getMind() + stud2.getWisdom() + stud2.getWit() + stud2.getCreation();
        int sum3 = stud3.getMind() + stud3.getWisdom() + stud3.getWit() + stud3.getCreation();

        if (sum1 > sum2 && sum1 > sum3) {
            System.out.println(stud1.getName() + " лучший Когтевранец, чем остальные " + stud2.getName() + " " + " и " + stud3.getName());
        } else if (sum2 > sum1 && sum2 > sum3) {
            System.out.println(stud2.getName() + " лучший Когтевранец, чем остальные " + stud1.getName() + " " + " и " + stud3.getName());
        } else if (sum3 > sum1 && sum3 > sum2) {
            System.out.println(stud3.getName() + " лучший Когтевранец, чем остальные " + stud1.getName() + " " + " и " + stud2.getName());
        } else {
            System.out.println("Когтевранцы равны");
        }

    }
}