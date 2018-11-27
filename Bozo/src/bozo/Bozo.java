package bozo;
import java.util.Scanner;

public class Bozo {
    
    public static void main(String[] args) {
        int n;
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira a quantidade de jogadores: ");
        n = ler.nextInt();
        Jogo bozo = new Jogo(n);
        bozo.iniciarJogo();
    }
    //FINALIZADO!
}
