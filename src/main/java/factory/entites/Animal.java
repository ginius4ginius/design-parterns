package factory.entites;

public abstract class Animal {

    private double taille=2;
    private double poid=2;
    private String nom;

    public Animal(){

    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double getPoid() {
        return poid;
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract void description();
}
