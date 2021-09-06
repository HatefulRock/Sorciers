public abstract class Personnage {
    protected String nom;
    protected int pdv;
    protected String type;

    public Personnage(){
        
    }
    public Personnage(String a, int b, String type){ 
        this.nom=a;
        this.pdv=b;
        this.type=type;

    }
    public String toString(){
        return "je m'appelle"+this.nom+" et j'ai"+this.pdv+"points de vie";
    }
    public String getNom(){
        return this.nom;
    }
    public Boolean mort(){
        if (this.pdv!=0){
            return false;
        }
        else{
            return true;
        }
    }
    public int getVie(){
        return this.pdv;
    }
    public void addVie(int num){
        this.pdv=this.pdv+num;
    }
    public abstract void attaque(Personnage p);
    public abstract int subitFrappe(int coup);
    public abstract int subitCharme(int coup);
}
