public class Hogwarts {

    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
    public  void studentInfo() {
        System.out.print("Имя студента- "+ name + ":" + " Сила магии: "+ magicPower + " Дальность трансгрессии: "+transgressionDistance);


    }
    public void compareMagicPower(Hogwarts otherStudent) {
        if (this.magicPower > otherStudent.magicPower) {
            System.out.println(this.name + " обладает больше силой магии ,чем " + otherStudent.name);
        } else if(this.magicPower < otherStudent.magicPower){
            System.out.println( otherStudent.name + " обладает больше силой магии ,чем " + this.name);
        }else{
            System.out.println(this.name +" " + otherStudent.name + " обладают одинаковой силой магии");
        }
    }
    public void compareTransgressionDistance(Hogwarts otherStudent) {
        if (this.transgressionDistance > otherStudent.transgressionDistance) {
            System.out.println(this.name +  " может трансгредировать на большее расстояние, чем " + otherStudent.name);
        } else if (this.transgressionDistance < otherStudent.transgressionDistance) {
            System.out.println(otherStudent.name + " может трансгредировать на большее расстояние, чем " + this.name);
        } else {
            System.out.println(this.name +  " и " + otherStudent.name + " могут трансгредировать на одинаковое расстояние.");
        }
    }
}
