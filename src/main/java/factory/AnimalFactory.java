package factory;

import factory.entites.Animal;
import factory.entites.Chat;
import factory.entites.Chien;

/**
 * Méthode 1
 */
public class AnimalFactory {

    public static final String TYPE_CHAT = "chat";
    public static final String TYPE_CHIEN = "chien";

    public Animal getAnimal(String type, double taille, double poid) {

        if(type.equals(TYPE_CHAT)){
            return new Chat(taille,poid);
        }
        else if(type.equals(TYPE_CHIEN)){
            return new Chien(taille,poid);
        }
        else{
            throw new IllegalArgumentException("Animal inconnu");
        }

    }

    public Animal getAnimal(String type) {

        if(type.equals(TYPE_CHAT)){
            return new Chat();
        }
        else if(type.equals(TYPE_CHIEN)){
            return new Chien();
        }
        else{
            throw new IllegalArgumentException("Animal inconnu");
        }

    }

}
