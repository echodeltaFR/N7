package attributs;

/** Information associée à une variable dans la table des symboles :
 * son type et son adresse (sa place en mémoire).
 */
public class InfoVar implements Info {
	
    /** Le type de la variable. */
    private TypeDeBase type;
    /** L'adresse de la variable (déplacement par rapport à une base). */
    private int deplacement;
    
    private String base;
	
	/** Creer une information associe a une variable
	 *@param t, son type
	 *@param dep, son placement memoire
	 */
    public InfoVar(TypeDeBase t, int dep, String b) {
        this.type = t;
        this.deplacement = dep;
	this.base = b;
    }	
	
    /** Renvoie le type de la variable. */
    public TypeDeBase getType() {
        return type;
    }
	
    /** Renvoie l'adresse de la variable (déplacement par rapport à la base de la pile). */
    public int getDeplacement() {
        return deplacement;
    }
	
    /** Renvoie la base par rapport a laquelle le deplacement est calcule */
    public String getBase(){
	return base;
    }
	
	/** Surchage de la methode toString() pour l'affichage */
    public String toString() {
        return "VAR(type=" + type + ",dep=" + deplacement +"["+base+"])";
    }

	public void setType(TypeDeBase tv) {
		this.type = tv;
	}

	public void setDeplacement(int dep) {
		this.deplacement = dep;
	}

	public void setBase(String reg) {
		this.base = reg;
	}
}
