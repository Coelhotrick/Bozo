package bozo;
import java.util.Random;


public class Dado {
    
    int numFaces;
    int face;
    
    public Dado(int n){
        numFaces = n;
    }
    
    public void rolar(){
        Random gerador = new Random();
        this.face = gerador.nextInt(this.numFaces)+1;
    }
    
    public void exibirFace(){
        System.out.println(this.face);
    }
    
    
}
