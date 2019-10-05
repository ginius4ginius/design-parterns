package factory;

import factory.entites.Animal;

/**
 * Méthode 2
 */
public abstract class AbstractFactory {

    public abstract Animal getAnimal();
    public abstract Animal getAnimal(double taille, double poid);

}
