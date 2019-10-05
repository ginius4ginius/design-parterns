package factory.entites;

public class Chien extends  Animal {

    public Chien(double taille, double poid){
        this.setTaille(taille);
        this.setPoid(poid);
        this.setNom("chien");
    }

    public Chien(){
        this.setNom("chien");
    }

    public void description() {

        System.out.println("Je suis un "+this.getNom()+" qui mesure "+this.getTaille()+" cm et qui pèse "+this.getPoid()+" kg");

    }
}
