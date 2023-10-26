package tn.esprit.gestionzoo.entities;

public final class  Terrestrial extends  Animal {
    private int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal ,int nbrLegs) {
        super(family, name, age, isMammal);   // ctrl + espace dans super donne les attr direct
        this.nbrLegs = nbrLegs;
    }

    public int getNbrlegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + "nbrLegs" + nbrLegs ;
    }
}
