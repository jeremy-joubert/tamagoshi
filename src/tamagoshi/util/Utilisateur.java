package tamagoshi.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utilisateur {

    public static String saisieClavier(){
        try{
            BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
            return clavier.readLine();
        }
        catch(IOException e){
            e.printStackTrace();
            System.exit(0); // on arrête le programme sur une telle erreur
            return null;
        }
    }

    public static void main(String[] args) {
        String saisie = Utilisateur.saisieClavier();
        System.out.println("la saisie est : "+saisie);
    }
}
