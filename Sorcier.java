public class Sorcier extends Personnage{
    double pouvoir;

    public Sorcier(String nom,int pdv, String type){
        this.nom=nom;
        this.pdv=pdv;
        this.type="Sorcier";
        this.pouvoir=Math.random();
    }
    public void attaque(Personnage p){
        if(p.nom=="Monstre"){
            p.pdv=p.pdv-this.subitCharme(this.pdv);
            this.pdv=this.pdv-p.subitFrappe(p.pdv);
            this.addVie(p.pdv/2);
        }
        else{
            
        }
    }

    public int subitCharme(int coup){
        if(this.mort()){
            return 0;
        }
        else {
            int s= (int) ((int) coup*this.pouvoir);
            return s;
        }
    }
    public int subitFrappe(int coup){
        return this.pdv/2;
    }
}
