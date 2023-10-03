import java.util.List;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int animalCount;


    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
    }

    // Constructor with parameters for initializing attributes
    public Zoo(String name, String city, int nbrCages, int animalCount) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.animalCount = animalCount;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville du zoo : " + city);
        System.out.println("Nombre de cages dans le zoo : " + nbrCages);
    }

   /* public String displayZoo() {
        return "Nom du zoo : " + name + "\nVille du zoo : " + city + "\nNombre de cages dans le zoo : " + nbrCages;
    } */

    // afficher la liste des animeaux dans le zoo
    public void displayAnimals() {
        System.out.println("Animaux dans le zoo:");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i].getName());
        }
    }

    //chercher animale
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
    // ajouter animale
    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println("exist déja.");
            return false;
        }

        if (animalCount < nbrCages) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            System.out.println("Le zoo est saturé.");
            return false;
        }
    }


    // supprimer un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);

        if (index != -1) {
            for (int i = index; i < animalCount - 1; i++) {
                animals[i] = animals[i + 1];
            }

            animals[animalCount - 1] = null;

            animalCount--;
            return true;
        } else {
            return false;
        }
    }




}