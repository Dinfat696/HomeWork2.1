public class Gryffindor {
    private int nobleness;//благородство
    private int honour;//честь
    private int bravery;//храбрость

    public Gryffindor(int nobleness, int honour, int bravery) {
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
}
