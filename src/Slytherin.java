public class Slytherin extends Hogwarts {
    private int cunning;//хитрость
    private int resolution;//решительность
    private int ambitiousness;//амибициозность
    private int resourcefulness;//находчивость
    private int thirstForPower;//жажда власти

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int resolution, int ambitiousness, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.resolution = resolution;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;

    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    public void studentInfo() {
        super.studentInfo();
        System.out.println(" Хитрость: " + cunning +" Решительность: " + resolution + " Амбициозность: " + ambitiousness + " Находчивость: " + resourcefulness + " Жажда власти: " + thirstForPower);

    }

    public static void compareStudents(Slytherin stud1, Slytherin stud2, Slytherin stud3) {
        int sum1 = stud1.getCunning() + stud1.getResourcefulness() + stud1.getAmbitiousness() + stud1.getResourcefulness() + stud1.getThirstForPower();
        int sum2 = stud2.getCunning() + stud2.getResourcefulness() + stud2.getAmbitiousness() + stud2.getResourcefulness() + stud2.getThirstForPower();
        int sum3 = stud3.getCunning() + stud3.getResourcefulness() + stud3.getAmbitiousness() + stud3.getResourcefulness() + stud3.getThirstForPower();

        if (sum1 > sum2 && sum1 > sum3) {
            System.out.println(stud1.getName() + " лучший Слизеринец, чем остальные " + stud2.getName() + " " + " и " + stud3.getName());
        } else if (sum2 > sum1 && sum2 > sum3) {
            System.out.println(stud2.getName() + " лучший Слизеринец, чем остальные " + stud1.getName() + " " + " и " + stud3.getName());
        } else if (sum3 > sum1 && sum3 > sum2) {
            System.out.println(stud3.getName() + " лучший Слизеринец, чем остальные " + stud1.getName() + " " + " и " + stud2.getName());
        } else {
            System.out.println("Слизеринцы равны");
        }

    }
}




