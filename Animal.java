public class Animal {
    private String family ;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String getName() {
        return name;
    }
    public String displayAnimal() {
        return "Famille de l'animal : " + family + "\nNom de l'animal : " + name + "\nÂge de l'animal : " + age + "\nEst un mammifère : " + isMammal;
    }




}
