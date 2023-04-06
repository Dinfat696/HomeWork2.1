public class Gryffindor extends Hogwarts {
    private int nobleness;//благородство
    private int honour;//честь
    private int bravery;//храбрость

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobleness, int honour, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobleness = nobleness;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobleness() {
        return nobleness;
    }

    public void setNobleness(int nobleness) {
        this.nobleness = nobleness;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public void studentInfo() {
        super.studentInfo();
        System.out.println(" Благородство: " + nobleness + " Честь: " + honour + " Храбрость: " + bravery );

    }

    public static void compareStudents(Gryffindor stud1, Gryffindor stud2, Gryffindor stud3) {
        int sum1 = stud1.getNobleness() + stud1.getHonour() + stud1.getBravery();
        int sum2 = stud2.getNobleness() + stud2.getHonour() + stud2.getBravery();
        int sum3 = stud3.getNobleness() + stud3.getHonour() + stud3.getBravery();

        if (sum1 > sum2 && sum1 > sum3) {
            System.out.println(stud1.getName() + " лучший Гриффиндорец, чем остальные " + stud2.getName() + " " + " и " + stud3.getName());
        } else if (sum2 > sum1 && sum2 > sum3) {
            System.out.println(stud2.getName() + " лучший Гриффиндорец, чем остальные " + stud1.getName() + " " + " и " + stud3.getName());
        } else if (sum3 > sum1 && sum3 > sum2) {
            System.out.println(stud3.getName() + " лучший Гриффиндорец, чем остальные " + stud1.getName() + " " + " и " + stud2.getName());
        } else {
            System.out.println("Гриффиндорцы равны");
        }

    }
}



