import java.util.*;

public  class AdresseType {

    public static int getSize( String t ) {
        if (t.equals("int") || t.equals("bool"))   return 1;
        if (t.equals("float")) return 2;
        System.err.println("Erreur type "+ t + " non dÃ©fini");
        return 0;
    }

    public final int adresse;
    public final String type;

    public AdresseType( int a, String t){
        this.adresse = a; // adress of initial cell on the stack to store the variable
        this.type = t;    // type of the variable
    }
}
