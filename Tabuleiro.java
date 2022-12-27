public class Tabuleiro {
    private int [][] dimensoes = new int [10][10];
    private int [][] PosicaoDefesa;
    private int [][] posicaoAtaque;
    private boolean acertar;
    private String erro;
    private String acerto;

    public int[][] getPosicaoDefesa(){
        return PosicaoDefesa;
    }
    public int[][] getPosicaoAtaque(){
        return posicaoAtaque;
    }
    //public void SetPosicaoDefesa(){}
    //public void SetPosicaoAtaque(){}


}
