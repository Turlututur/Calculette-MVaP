import java.util.*;
 

public class TableSymboles {

    // A hash table to recall global variables that have been declared so far
    // A variable is represented by its name.
    // We assume that named are not reused, i.e. we can not have a variable x that is both an int and a float.
    private HashMap<String, AdresseType> table = new HashMap<String, AdresseType>();

    public AdresseType getAdresseType(String s) { return table.get(s); }
    
    // n is a short hand for next free address :)
    private int n = 0;
    // returns the next available address that is available to store a global variable (initially 0).
    public Integer getSize() { return n;}

    public void putVar(String s, String t) {
	if (table.get(s) != null)
	    System.err.println("Erreur : Variable \""+ s + "\" de type " + table.get(s).type + " dÃ©jÃ  dÃ©finie");
        else 
            {
                AdresseType at = new AdresseType(n,t);
                table.put(s, at);
                n+=AdresseType.getSize(t);
            }
    }

    public String toString() { return table.toString(); }
}
    
