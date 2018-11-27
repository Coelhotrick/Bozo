package bozo;
import java.util.Scanner;

public class Jogador {
    
    Dado dados [] = new Dado [5];
    Tabuleiro tab;
    String nome;
    int pont;
    
    public Jogador(int n){
        pont = 0;
        tab = new Tabuleiro();
        System.out.println("Insira o nome do jogdor "+n+": ");
        //recebe o nome do jogador
        Scanner ler = new Scanner(System.in);
        nome = ler.nextLine();
        System.out.println("Insira o número de faces dos dados de "+this.nome+": ");
        int j = ler.nextInt();
        for (int i = 0; i < 5; i++)
            dados[i] = new Dado(j);
    }
    
    public void lancaDados(){
        for (int i = 0; i<5; i++){
            dados[i].rolar();
            System.out.print("Dado "+i+": ");
            dados[i].exibirFace();
        }
    }
    
    public void escolheDados(){
        for (int j = 0; j<3; j++){
            System.out.println("Escolha um dado para rerolar");
            
            //recebe os dados que quer rerolar
            Scanner ler = new Scanner(System.in);
            System.out.print("Escolha: ");
            int d = ler.nextInt();
            if (d != -1){
                dados[d].rolar();
                System.out.print("Resultado: ");
                dados[d].exibirFace();
                for (int i = 0; i<5; i++){
                    System.out.print(i+"- ");
                    dados[i].exibirFace();
                }
            }
            else
                System.out.println("Nenhum dado foi rerolado!");
                
        }
    }
        
    public void escolhePosicao(){
        System.out.println("Escolha a posição onde quer pontuar: ");
        tab.exibeTabuleiro();
        System.out.print("Escolha: ");
        Scanner ler = new Scanner(System.in);
        int p = ler.nextInt();
        System.out.println("Posição escolhida: "+tab.nome[p]);
        if (p != -1){
            tab.calculaPontuacao(p, dados);
            tab.exibeTabuleiro();
        }
        else {
            System.out.println("Posição Inválida! 0 Pontos");
            tab.pontPosic[p] = 0;
        }
    }
        
    public void calculaPont(){
        for (int i=0; i<9; i++)
            pont = tab.pontPosic[i] + pont;
    }
}
