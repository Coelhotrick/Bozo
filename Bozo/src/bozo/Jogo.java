package bozo;

public class Jogo {
    
    int n;
    Jogador [] jogador;
    //Dado [] dadosJogo;
    
    public Jogo(int n){
        this.n = n;
        jogador = new Jogador [n];
        for (int i = 0; i<n; i++)
            jogador[i] = new Jogador(i);
    }
    
    public void iniciarJogo(){
        System.out.println("O JOGO COMEÇOU!");
        for (int j=0; j<n; j++){
            for (int i=0; i<9; i++){
                System.out.println(jogador[j].nome+" está rolando os dados...");
                jogador[j].lancaDados();
                jogador[j].escolheDados();
                jogador[j].escolhePosicao();
            }
        }
        for (int i=0; i<n; i++){
            jogador[i].calculaPont();
        }
        int maior = jogador[0].pont;
        int m = 0;
        for (int i=0; i<n; i++){
            if (jogador[i].pont > maior){
                maior = jogador[i].pont;
                m = i;
            }
        }
        System.out.println(jogador[m].nome+" venceu o jogo!!!");
    }
}
