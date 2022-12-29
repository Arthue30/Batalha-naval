public class Tabuleiro {
    private int [][] dimensoes = new int [10][10];
    private int [][] posicaoDefesa;
    private int [][] posicaoAtaque;
    private boolean acertar;
    private String erro;
    private String acerto;

    public int[][] getPosicaoDefesa(){
        return posicaoDefesa;
    }
    public int[][] getPosicaoAtaque(){
        return posicaoAtaque;
    }
    public void SetPosicaoDefesa(int [][] posicaoDefesa){
        this.posicaoDefesa = posicaoDefesa;

    }
    public void SetPosicaoAtaque(int [][] posicaoAtaque){
        this.posicaoAtaque = posicaoAtaque;
    }


}
