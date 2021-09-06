import java.util.ArrayList;
public class Jeu{
	public static void main(String[] args){
        
        ArrayList<Personnage> m= new ArrayList<Personnage>();
        ArrayList<Personnage> s= new ArrayList<Personnage>();
        for (int i=0; i<5;i++){
            m.add(Monstre("Monstre"+i,(int) (100*Math.random()),"Monstre"));
            s.add(Sorcier("Monstre"+i,(int) (100*Math.random()),"Sorcier"));
        }
        for(int i=0;i<50;i++){
            
        } 
        for(int i=0;i<5;i++){
            System.out.println(m.get(i));
            System.out.println(s.get(i));
        }
    }

    private static Personnage Monstre(String string, int i, String string2) {
        return null;
    }

    private static Personnage Sorcier(String string, int i, String string2) {
        return null;
    }

        

    
}