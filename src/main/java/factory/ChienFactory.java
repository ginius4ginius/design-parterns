package factory;

import factory.entites.Animal;
import factory.entites.Chien;

public class ChienFactory extends AbstractFactory {
    public Animal getAnimal() {
        return new Chien();
    }

    public Animal getAnimal(double taille, double poid) {
        return new Chien(taille,poid);
    }
}
