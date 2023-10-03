
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("lion","symba",3,true);
        Animal giraffe = new Animal("Girafe", "Melman", 7, true);



        Zoo myZoo = new Zoo("belvidaire","tunis",25);
        myZoo.displayZoo();

        // Affichage du zoo avec les deux instructions
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        myZoo.displayAnimals();
        System.out.println( myZoo.addAnimal(lion));
        System.out.println( myZoo.addAnimal(giraffe));


        // Recherche d'un animal par nom
        Animal searchedAnimal = new Animal("lion", "symba", 3, true);
        int index = myZoo.searchAnimal(searchedAnimal);
        if (index != -1) {
            System.out.println("L'animal " + searchedAnimal.getName() + " a été trouvé à l'indice : " + index);
        } else {
            System.out.println("L'animal " + searchedAnimal.getName() + " n'a pas été trouvé dans le zoo.");
        }


        // supprimer animale

        boolean removal = myZoo.removeAnimal(lion);
        if (removal) {
            System.out.println("L'animal a été supprimé avec succès.");
        } else {
            System.out.println("L'animal n'a pas été trouvé ");
        }


    }



    }
