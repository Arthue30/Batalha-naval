package Model;

public class Objetos {

    private int navio1 = 4;
    private int navio2 = 3;
    private int navio3 = 2;
    private int navio4 = 1;
    private int portaAvioes = 1;

    public int getNavio1() {
        return navio1;
    }

    public int getNavio2() {
        return navio2;
    }

    public int getNavio3() {
        return navio3;
    }

    public int getNavio4() {
        return navio4;
    }

    public int getPortaAvioes() {
        return portaAvioes;
    }

    public void posicionaNavio1(int i, int j,int[][] tabuleiro){                                                        //Metodo para printar/armazenar a posição dos navios tipo 1 no tabuleiro
        tabuleiro[i][j]=1;//♫
    }
    public void posicionaNavio2(int i, int j,int[][] tabuleiro,char direcao){
        if(direcao=='v'||direcao=='V'){
            tabuleiro[i][j]=2;
            tabuleiro[i+1][j]=2;
        }
        else{
            tabuleiro[i][j]=2;
            tabuleiro[i][j+1]=2;
        }
    }
    public void posicionaNavio3(int i, int j,int[][] tabuleiro,char direcao){
        if(direcao=='v'||direcao=='V'){
            tabuleiro[i][j]=3;
            tabuleiro[i+1][j]=3;
            tabuleiro[i+2][j]=3;
        }
        else{
            tabuleiro[i][j]=3;
            tabuleiro[i][j+1]=3;
            tabuleiro[i][j+2]=3;
        }
    }
    public void posicionaNavio4(int i, int j,int[][] tabuleiro,char direcao){
        if(direcao=='v'||direcao=='V'){
            tabuleiro[i][j]=4;
            tabuleiro[i+1][j]=4;
            tabuleiro[i+2][j]=4;
            tabuleiro[i+3][j]=4;
        }
        else {
            tabuleiro[i][j]=4;
            tabuleiro[i][j+1]=4;
            tabuleiro[i][j+2]=4;
            tabuleiro[i][j+3]=4;
        }
    }
    public void portaAvioes(int i, int j,int[][] tabuleiro,int girar){
        if (girar==1){
            tabuleiro[i][j]=5;
            tabuleiro[i][j+1]=5;
            tabuleiro[i][j+2]=5;
            tabuleiro[i+1][j+1]=5;
            tabuleiro[i+2][j+1]=5;
        }
        else if (girar==2){
            tabuleiro[i][j]=5;
            tabuleiro[i+1][j]=5;
            tabuleiro[i+2][j]=5;
            tabuleiro[i+1][j-1]=5;
            tabuleiro[i+1][j-2]=5;
        }
        else if (girar==3){
            tabuleiro[i][j]=5;
            tabuleiro[i][j+1]=5;
            tabuleiro[i][j+2]=5;
            tabuleiro[i-1][j+1]=5;
            tabuleiro[i-2][j+1]=5;
        }
        else{
            tabuleiro[i][j]=5;
            tabuleiro[i+1][j]=5;
            tabuleiro[i+2][j]=5;
            tabuleiro[i+1][j+1]=5;
            tabuleiro[i+1][j+2]=5;
        }
    }


    public void posicionaAtaque(int i, int j,int[][] tabuleiro){
        tabuleiro[i][j]=1;
    }
}