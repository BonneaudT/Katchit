package org.domaine;

public class boucle {

    public boucle(){

    }

    public void affichage(int j) {
        if (j > 1) {
            System.out.println("Il vous reste : " + j + "unités");
            return;
        } else if (j == 1) {
            System.out.println("Il vous reste : " + j + "unité");
            return;
        }
        System.out.println("Fin");
    }

    public void boucleTimer(int i){
        while (i > -1){
            affichage(i);
            i--;
        }
    }
}
