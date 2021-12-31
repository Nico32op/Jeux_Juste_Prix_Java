package jeux;

import java.util.Random;
import java.util.Scanner;

public class Juste_Prix {
    public static void main(String[] args) {
        System.out.println("Bonjour à tous");
        System.out.println("Entrez un nombre entre 0 et 400 =)");
    Random r = new Random(); //import le librairies random qui permet de générer des nombres aléatoires
    int justeprix = r.nextInt(400); // les nombres aléatoires ne peuvent pas dépasser 400
    Scanner scan = new Scanner(System.in);//création de l'outil Scanner qui permet d'intéragir avec le programme (via la console) car il permet au programme de lire le texte
    int prix = scan.nextInt(); //le prix est égal à la valeur entrée par l'utilisateur dans la console
    int essai = 0;
    
    while(justeprix != prix){ //tant que juste prix n'est pas égale à prix
    
    if(justeprix > prix){
        System.out.println("C'est plus!");
    }else {
        System.out.println("C'est moins!");
    }
    prix = scan.nextInt(); // Affiche le nombre saisit par l'utilisateur
    essai++;
    } 
    scan.close(); //fermeture du scan
    System.out.println("Bravo le juste prix est de " + justeprix + " euros"); //affiche le message suivant une fois que la condition de la boucle est remplie
    System.out.println("Vous l'avez trouvé en " + essai + " essais");
}
}