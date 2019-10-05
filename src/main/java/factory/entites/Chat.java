package factory.entites;

public class Chat extends Animal {

    public Chat(double taille, double poid){
        this.setTaille(taille);
        this.setPoid(poid);
        this.setNom("chat");
    }

    public Chat(){
        this.setNom("chat");
    }

    public void description() {

        System.out.println("Je suis un "+this.getNom()+" qui mesure "+this.getTaille()+" cm et qui pèse "+this.getPoid()+" kg");

    }
}
