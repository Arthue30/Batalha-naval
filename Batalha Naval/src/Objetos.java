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

    public void posicionaNavio1(int i, int j,int[][] tabuleiro){
        tabuleiro[i][j]=1;//♫

        //for(int i=1;i<2;i++){
        //    System.out.println("@");
    }
    public void posicionaNavio2(int i, int j,int[][] tabuleiro,char direcao){
        if(direcao=='v'||direcao=='V'){
            tabuleiro[i][j]=2;
            tabuleiro[i+1][j]=2;
        //for(int i=1;i<3;i++){
         //   System.out.println("@");
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
        //for(int i=1;i<4;i++){
        //    System.out.println("@");
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
        //for(int i=1;i<5;i++){
        //    System.out.println("@");
        }
        else {
            tabuleiro[i][j]=4;
            tabuleiro[i][j+1]=4;
            tabuleiro[i][j+2]=4;
            tabuleiro[i][j+3]=4;
        }
    }
    /*public void portaAvioes(int i, int j,int[][] tabuleiro,char direcao){
        int i,j;
        for (i=0;i<=2;i++){
            for(j=0;j<=2;j++){
                if(i==0 || i>=1 && i<=2 && j==1){
                    System.out.print("@");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
     */
}
