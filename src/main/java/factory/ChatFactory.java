package factory;

import factory.entites.Animal;
import factory.entites.Chat;

public class ChatFactory extends AbstractFactory {
    public Animal getAnimal() {
        return new Chat();
    }

    public Animal getAnimal(double taille, double poid) {
        return new Chat(taille,poid);
    }
}
