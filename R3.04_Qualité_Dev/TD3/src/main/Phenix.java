package main;

public class Phenix extends Ovipare implements Volant{
    public Phenix(String nom, int age, int sexe, int poids, int taille) {
        super(nom, age, sexe, poids, taille);
    }

    @Override
    protected void meurt() {
        System.out.println("La créature renée de ses cendres");
        this.indicateurSante = 100;
        this.age = 0;
    }
}
