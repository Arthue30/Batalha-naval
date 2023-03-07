public class Tabuleiro extends Objetos{
    private char [][] posicaoNavios;
    private int [][] ataque;
    //private boolean acertar;

    public int[][] getPosicaoNavios(){
        return posicaoNavios;
    }
    public int[][] getAtaque(){
        return ataque;
    }
    public void SetPosicaoNavios(int [][] posicaoNavios){
        this.posicaoNavios = posicaoNavios;

    }
    public void SetAtaque(int [][] ataque){
        this.ataque = ataque;
    }

    public void criaTabuleiros(){
        int[][] tabuleiro1 = new int [10][10];
        int[][] tabuleiro2 = new int [10][10];
    }

    public Tabuleiro(){
    }
}
