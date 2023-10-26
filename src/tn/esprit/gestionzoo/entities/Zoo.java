package tn.esprit.gestionzoo.entities;


public class Zoo {

    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;

    private Aquatic[] aquaticAnimals;
    private String name, city;
    private int nbrAnimals;
    private int nbrAquaticAnimals ;



    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }




    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
        aquaticAnimals = new Aquatic[10];
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }


    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals < aquaticAnimals.length) {
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
            System.out.println(aquatic.getName() + " added to the aquatic animals .");
        } else {
            System.out.println("The aquatic animals is full.");
        }
    }

    // instruc 29
    public float maxPenguinSwimmingDepth() {
        float maxDepth = -1;  // Une valeur négative pour vérifier si au moins un pingouin a été trouvé

        Aquatic[] aquaticAnimals = getAquaticAnimals();  // Obtenez le tableau d'animaux aquatiques

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {  // Vérifiez si l'animal est un pingouin
                Penguin penguin = (Penguin) aquatic;  // Conversion de l'objet Aquatic en objet Penguin
                float swimmingDepth = penguin.getSwimmingDepth();
                if (swimmingDepth > maxDepth) {
                    maxDepth = swimmingDepth;
                }
            }
        }

        return maxDepth;
    }


    // insctruction 30
    public void displayNumberOfAquaticsByType() {
        int numberOfDolphins = 0;
        int numberOfPenguins = 0;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                numberOfDolphins++;
            } else if (aquatic instanceof Penguin) {
                numberOfPenguins++;
            }
        }

        System.out.println("Number of Dolphins: " + numberOfDolphins);
        System.out.println("Number of Penguins: " + numberOfPenguins);
    }



}
