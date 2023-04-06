public class Hufflepuff extends Hogwarts {
    private int industry;//трудолюбие
    private int faithfulness;//верность
    private int honesty;//честность

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int industry, int faithfulness, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.industry = industry;
        this.faithfulness = faithfulness;
        this.honesty = honesty;
    }

    public int getIndustry() {
        return industry;
    }

    public void setIndustry(int industry) {
        this.industry = industry;
    }

    public int getFaithfulness() {
        return faithfulness;
    }

    public void setFaithfulness(int faithfulness) {
        this.faithfulness = faithfulness;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void studentInfo() {
        super.studentInfo();
        System.out.println(" Трудолюбие: " + industry + " Верность: " + faithfulness + " Честность: " + honesty);

    }
    public static void compareStudents(Hufflepuff stud1, Hufflepuff stud2, Hufflepuff stud3) {
        int sum1 = stud1.getIndustry() + stud1.getFaithfulness() + stud1.getHonesty();
        int sum2 = stud2.getIndustry() + stud2.getFaithfulness() + stud2.getHonesty();
        int sum3 = stud3.getIndustry() + stud3.getFaithfulness() + stud3.getHonesty();

        if (sum1 > sum2 && sum1 > sum3) {
            System.out.println(stud1.getName() + " лучший Пуффендуец, чем остальные " + stud2.getName() + " " + " и " + stud3.getName());
        } else if (sum2 > sum1 && sum2 > sum3) {
            System.out.println(stud2.getName() + " лучший Пуффендуец, чем остальные " + stud1.getName() + " " + " и " + stud3.getName());
        } else if (sum3 > sum1 && sum3 > sum2) {
            System.out.println(stud3.getName() + " лучший Пуффендуец, чем остальные " + stud1.getName() + " " + " и " + stud2.getName());
        } else {
            System.out.println("Пуффендуйцы равны");
        }
    }

}