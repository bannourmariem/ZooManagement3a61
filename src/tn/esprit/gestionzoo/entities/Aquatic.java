package tn.esprit.gestionzoo.entities;

public non-sealed class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family,name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitant(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + "habiat" +habitat ;
    }

    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }

    // instrcution  31   override car la methode mete5dha mn classe mére
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Aquatic other = (Aquatic) obj;

        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.getHabitat().equals(other.getHabitat());
    }

    /* @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj instanceof Aquatic aquatic) {
            return aquatic.habitat.equals(habitat) && aquatic.getName().equals(super.getName()) && aquatic.getAge() == super.getAge();
        }
        return false;
    }  */




}





