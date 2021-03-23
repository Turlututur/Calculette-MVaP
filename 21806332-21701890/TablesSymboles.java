import java.util.*;

/** 
 * Tables des symboles :
 *     _ Une table pour les variables globales; et,
 *     _ une pour les variables locales.
 *
 *     Chaque table donne pour chaque variable sa position, donc son adresse dans la pile.
 *     On recherche d'abord en local, si dÃ©fini. Comme on manipule des variables typÃ©es, on stocke Ã©galement le type.
 *     On utlise ici des tables de hachage stockant des objets AdresseType.
 *
 * Pour autoriser un fonction et une variable de mÃªme nom, on ajoute aussi :
 *     _ Une Table des Ã©tiquettes des fonctions.
 *
 * Note : une pile de tables pourrait Ãªtre nÃ©cessaire,
 *        si on voulait pouvoir dÃ©finir des fonctions dans des fonctions...
 */
class TablesSymboles {
    private TableSymboles _tableGlobale = new TableSymboles();
    private TableSymboles _tableLocale = null;
    
    public void newTableLocale() { 
	_tableLocale = new TableSymboles(); 
    }
    public void dropTableLocale() { 
	_tableLocale = null; 
    }
    public void putVar(String s, String t) { 
	if (_tableLocale != null)
	    _tableLocale.putVar(s,t);
	else
	    _tableGlobale.putVar(s,t);
    }
    /**
     * Les adresses des variables locales sont comptÃ©es nÃ©gativement Ã  partir de fp.
     * Vision de la pile:
     *                                fp
     *                                \/
     *     ...  rr  p1  p2  ... pcr  fp(-1)
     * 
     * oÃ¹ rr est la place pour la valeur retournÃ©e par la fonction (Ã©ventuellement)
     * et :
     *     p1 est la place du 1er paramÃ¨tre 
     *     p2 est la place du 2e paramÃ¨tre
     *     ...
     *     pcr est le compteur de programme (pc) au retour 
     *                (lÃ  oÃ¹ il faut se brancher aprÃ¨s sortie de la fonction)  
     *     fp(-1) est la valeur du fp prÃ©cÃ©dent (nÃ©cessaire pour restaurer l'environnement)  
     *     fp est la valeur du fp courant, lÃ  oÃ¹ est stockÃ© fp(-1)
     * 
     * La distance dans la pile sÃ©parant la place de la variable locale correspondant
     * au premier paramÃ¨tre  de la place pointÃ©e par le fp courant est donc Ã©gale : 
     * au nombre de paramÃ¨tres de la fonction plus 2 (Ã  cause de pc et fp qui sont empilÃ©s par CALL).
     * 
     * L'adresse par rapport Ã  fp d'une variable est toujours nÃ©gative et se calcule comme :
     * son rang, moins le nombre de paramÃ¨tres, moins 2.
     *
     * Note : on a trichÃ© ci-dessus dans l'explication pour faire comme si on avait uniquement des variables de type int qui ne prenne qu'une cellule de la pile.
     * Pour gÃ©rer les flottants (qui sont supportÃ©s "nativement" par la MVÃ P), il faut tenir compte des tailles des variables qui compte pour 1 ou pour 2 dans 
     * le calcul 
     *
     */
    private AdresseType getAdresseTypeLocale(String symbol) {
	if (_tableLocale != null) {
	    System.err.println("Recherche de "+ symbol + " dans table locale: " + _tableLocale);
	    AdresseType a = _tableLocale.getAdresseType(symbol);
	    if (a != null) { // on a trouvÃ©
		 return new AdresseType(a.adresse - (_tableLocale.getSize() + 2), a.type);
	    }
	}
	System.err.println(symbol + " pas trouvÃ© en local");
	return null;
    }
   
    private AdresseType getAdresseTypeGlobale(String symbol) {
	System.err.println("Recherche de "+ symbol + " dans table globale: " + _tableGlobale
			   + " => @"+ _tableGlobale.getAdresseType(symbol));
	return _tableGlobale.getAdresseType(symbol);
    }
   
    
    /** donne l'adresse de la variable locale Ã  une fonction (nÃ©gative) ou globale (positive) */
    public AdresseType getAdresseType(String symbol) { 
	AdresseType a = getAdresseTypeLocale(symbol);
	if (a == null)
	    a = getAdresseTypeGlobale(symbol);
	if (a != null)                    
	    return a;
            
	System.err.println("## Erreur : la variable \"" + symbol + "\" n'existe pas");
	return null; // n'importe quoi, et l'adresse nâ€™existe pas!
    }

    private HashMap<String, String> _tableFonctions = new HashMap<String, String>();    
    
    public String getFunction(String function) {
	String l = _tableFonctions.get(function);
	if (l != null)
	    return l;
	System.err.println("Appel Ã  une fonction non dÃ©finie \""+function+"\"");
	return null;
    }

    public boolean newFunction(String function,String t) {
        String fat = _tableFonctions.get(function);
	if ( fat!= null ) {
	    System.err.println("Fonction \""+ function + "\" dÃ©jÃ  dÃ©finie avec type de retour \"" + fat +"\".");
	    return false;
	}
	_tableFonctions.put(function, t);
	return true;
    }
}
    