/*
Mini-Projet Santorini
BRIANT HELLEUX DUFOUR
 */
package santorini_briant_helleux_dufour;

/**
 *
 * @author romdu
 */
public class Joueur {
    Personnage [] liste_perso = new Personnage[2];
    String Couleur;
    String Nom;
    
    public Joueur (String nom, String couleur){
        Personnage perso1 = new Personnage(couleur);
        Personnage perso2 = new Personnage(couleur);
        liste_perso[0] = perso1;
        liste_perso[1] = perso2;
        liste_perso[0].teinte= couleur+"_clair";
        liste_perso[1].teinte= couleur+"_fonce";
        Nom = nom;
    }
}
