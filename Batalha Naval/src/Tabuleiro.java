import java.util.Scanner;
public class Tabuleiro extends Objetos{

    private int [][] tabuleiro;
    private char [][] posicaoNavios;
    private char [][] ataque;
    //private boolean acertar;

    public char [][] getPosicaoNavios(){
        return posicaoNavios;
    }
    public char[][] getAtaque(){
        return ataque;
    }
    public void SetPosicaoNavios(char [][] posicaoNavios){
        this.posicaoNavios = posicaoNavios;

    }
    public void SetAtaque(char [][] ataque){
        this.ataque = ataque;
    }

    public void printaTabuleiros(){
        for(int i=0; i<10; i++){
            for(int j=0; j<10;j++){
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println();
        }
    }

    public void posicionaNavios(){
        Scanner pn = new Scanner(System.in);
        System.out.println("Posicione os navios do tipo 1.");
            for (int i=0; i<4; i++){
                System.out.println("digite V para vertical, ou H para horizontal: ");
                char direcao = pn.next().charAt(0);
                System.out.println("escolha a linha de 1 a 10: ");
                int l = pn.nextInt()-1;
                System.out.println("escolha a coluna de 1 a 10: ");
                int c = pn.nextInt()-1;
                posicionaNavio1(l,c,tabuleiro);
            }

        System.out.println("Posicione os navios do tipo 2.");
        for (int i=0; i<3; i++){
            System.out.println("digite V para vertical, ou H para horizontal: ");
            char direcao = pn.next().charAt(0);
            System.out.println("escolha a linha de 1 a 10: ");
            int l = pn.nextInt()-1;
            System.out.println("escolha a coluna de 1 a 10: ");
            int c = pn.nextInt()-1;
            posicionaNavio2(l,c,tabuleiro,direcao);
        }

        System.out.println("Posicione os navios do tipo 3.");
        for (int i=0; i<2; i++) {
            System.out.println("digite V para vertical, ou H para horizontal: ");
            char direcao = pn.next().charAt(0);
            System.out.println("escolha a linha de 1 a 10: ");
            int l = pn.nextInt() - 1;
            System.out.println("escolha a coluna de 1 a 10: ");
            int c = pn.nextInt() - 1;
            posicionaNavio3(l, c, tabuleiro, direcao);
        }

        System.out.println("Posicione os navios do tipo 4.");
        //for (int i=0; i<1; i++){
            System.out.println("digite V para vertical, ou H para horizontal: ");
            char direcao = pn.next().charAt(0);
            System.out.println("escolha a linha de 1 a 10: ");
            int l = pn.nextInt()-1;
            System.out.println("escolha a coluna de 1 a 10: ");
            int c = pn.nextInt()-1;
            posicionaNavio4(l,c,tabuleiro,direcao);
    }
    public Tabuleiro(){
        this.tabuleiro= new int [10][10];
    }
}
