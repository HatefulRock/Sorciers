public class Monstre extends Personnage{
    
    public Monstre(String nom,int pdv, String type){
        this.nom=nom;
        this.pdv=pdv;
        this.type="Monstre";

    }
    public void attaque(Personnage p){
        if(p.type=="Monstre"){
            p.pdv=p.pdv-p.subitFrappe(this.pdv);
            this.pdv=this.pdv-p.subitFrappe(p.pdv);
        }
        else{
            p.pdv=p.pdv-p.subitFrappe(this.pdv);
            this.pdv=this.pdv-p.subitCharme(p.pdv);
        }
    }


    public int subitFrappe(int coup){
        if(this.mort()){
            return 0;
        }
        else{
            return this.pdv/2;
        }
    }
    public int subitCharme(int coup){
        return this.pdv;
    }
}
