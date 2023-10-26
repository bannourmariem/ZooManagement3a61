package tn.esprit.gestionzoo.main;


import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

        Aquatic aquatic = new Aquatic("Ocean","fff",6,true,"zoo1");
        Terrestrial terrestrial = new Terrestrial ("Ocean","fff",6,true,4);

        // Dauphin
        Dolphin dolphin = new Dolphin("Ocean","fff",6,true,"zoo1",25.0f);

        // Pingouin
        Penguin penguin = new Penguin("Antarctique","hello",6,true,"zoo1", 10.0f);

        Aquatic dolphin2 = new Dolphin("Ocean","fff",6,true,"zoo1",25.0f);



        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        aquatic.swim();
        dolphin.swim();
        penguin.swim();   // il va afficher aquatic non penguin parceque on n'a pas mis methode public void swim dans classe Penguin

        // Ajout d'animaux aquatiques au zoo
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);


        // Appel de la méthode swim() pour tous les animaux aquatiques dans le zoo

        for (Aquatic aquaticAnimals : myZoo.getAquaticAnimals()) {
            if(aquaticAnimals != null)
            aquatic.swim();
        }

        //tester la methode maxPenguinSwimmingDepth  pour obtenir la profondeur maximale de nage des pingouins
        float maxDepth = myZoo.maxPenguinSwimmingDepth();
        System.out.println("La profondeur maximale de nage des pingouins dans le zoo est : " + maxDepth);


        // Display the number of aquatic animals by type
        myZoo.displayNumberOfAquaticsByType();


        System.out.println("Is dolphin1 equal to dolphin2? " + dolphin.equals(dolphin2));



    }





}

