public class Main {
    public static void main(String[] args) {

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой",10,10,10,10,10,10,10);
        Slytherin grahamMontagu = new Slytherin("Грэхэм Монтегю",11,11,11,11,11,11,11);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл",12,12,12,12,12,12,12);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг",13, 13,  13, 13, 14,14);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 14, 14, 14, 14, 14,14);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 15,15, 15, 15, 15,15);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит",16,16,16,16,16);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори",16,16,16,16,16);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли",17,17,17,17,17);
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер",18,18,18,18,18);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер",19,19,19,19,19);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли",20,20,20,20,20);

        dracoMalfoy.studentInfo();
        grahamMontagu.studentInfo();
        gregoryGoyle.studentInfo();
        zhouChang.studentInfo();
        padmaPatil.studentInfo();
        marcusBelby.studentInfo();
        zachariasSmith.studentInfo();
        cedricDiggory.studentInfo();
        justinFinchFletchley.studentInfo();
        harryPotter.studentInfo();
        hermioneGranger.studentInfo();
        ronWeasley.studentInfo();

        Gryffindor.compareStudents(harryPotter, hermioneGranger, ronWeasley);
        Slytherin.compareStudents(dracoMalfoy, grahamMontagu, gregoryGoyle);
        Hufflepuff.compareStudents(zachariasSmith, cedricDiggory, justinFinchFletchley);
        Ravenclaw.compareStudents(zhouChang, padmaPatil, marcusBelby);
        harryPotter.compareMagicPower(hermioneGranger);
        dracoMalfoy.compareTransgressionDistance(zachariasSmith);
    }

    }

