package factory;

import factory.entites.Animal;

public class MainFactory {

    public static void main (String[]args){
        factoryMethode(2);
    }

    public static void factoryMethode(int methode) {
        //premiere méthode avec une factory principale qui attends les paramètre pour définir l'objet
        if(methode == 1){
            AnimalFactory animalFactory = new AnimalFactory();

            Animal chat = animalFactory.getAnimal("chat",10.10,20.20);
            chat.description();
            Animal chat2 = animalFactory.getAnimal("chat");
            chat2.description();
            Animal chien = animalFactory.getAnimal("chien",20.10,30.20);
            chien.description();
            Animal elephant = animalFactory.getAnimal("elephant",10.10,20.20);
            elephant.description();
        }

        //deuxième méthode avec une factory abstraite qui à 2 classes filles par type d'instance ( chat ou chien )
        if(methode == 2){

            ChatFactory chatFactory = new ChatFactory();
            ChienFactory chienFactory = new ChienFactory();

            Animal chat = chatFactory.getAnimal(10.10,20.20);
            chat.description();
            Animal chat2 = chatFactory.getAnimal();
            chat2.description();
            Animal chien = chienFactory.getAnimal(20.10,30.20);
            chien.description();

        }



    }
}
