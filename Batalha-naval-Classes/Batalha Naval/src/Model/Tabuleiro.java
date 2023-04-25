package Model;

import Controller.clear;

import java.util.Scanner;
public class Tabuleiro extends Objetos {

    private int[][] tabuleiro;
    private int l;
    private int c;
    private char direcao;
    private int girar;
    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(int number, int i, int j) {
        this.tabuleiro[i][j] = number;
    }


    public Tabuleiro() {
        this.tabuleiro = new int[10][10];
    }

    public void printaTabuleiros() {
        System.out.println("--ABCDEFGHIJ--");
        for (int i = 0; i < 10; i++) {
            System.out.print("||");
            for (int j = 0; j < 10; j++) {
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println("|"+(i+1));
        }
        System.out.println("Batalha Naval");
    }

    public void posicionaN1(Tabuleiro tabuleiroDefesa,int navio1) {
        Scanner input = new Scanner(System.in);
        System.out.println("Posicione os navios do tipo 1.");
        for (int i = 0; i < navio1; i++) {

            System.out.println("escolha a linha de 1 a 10: ");
            l = input.nextInt() - 1;
            while (l > 9 || l < 0) {
                System.out.println("selecione uma linha valida, entre 1 e 10:");
                l = input.nextInt() - 1;
            }

            System.out.println("escolha a coluna de 1 a 10: ");
            c = input.nextInt() - 1;
            while (c > 9 || c < 0) {
                System.out.println("selecione uma coluna valida, entre 1 e 10:");
                c = input.nextInt() - 1;
            }



            if (tabuleiroDefesa.getTabuleiro()[l][c] > 0) {
                System.out.println("esta posição é inválida!");
                i--;
            } else {
                posicionaNavio1(l, c, tabuleiro);
            }
            clear.screen();
            printaTabuleiros();
        }
    }

    public void posicionaN2(Tabuleiro tabuleiroDefesa,int navio2){
        Scanner input = new Scanner(System.in);
        System.out.println("Posicione os navios do tipo 2.");
        for(int i = 0; i < navio2;i++){

            while(true) {
                System.out.println("digite V para vertical, ou H para horizontal: ");
                char dire = input.next().charAt(0);
                if (dire == 'v' || dire == 'V' || dire == 'h' || dire == 'H') {
                    direcao=dire;
                    break;
                }
            }
            System.out.println("escolha a linha de 1 a 10: ");
            l = input.nextInt() - 1;
            while (l > 9 || l < 0) {
                System.out.println("selecione uma linha valida, entre 1 e 10:");
                l = input.nextInt() - 1;
            }
            System.out.println("escolha a coluna de 1 a 10: ");
            c = input.nextInt() - 1;
            while (c > 9 || c < 0) {
                System.out.println("selecione uma coluna valida, entre 1 e 10:");
                c = input.nextInt() - 1;
            }

            if (tabuleiroDefesa.getTabuleiro()[l][c]>0||tabuleiroDefesa.getTabuleiro()[l+1][c]>0||tabuleiroDefesa.getTabuleiro()[l][c+1]>0){
                System.out.println("esta posição é inválida!");
                i--;
            }
            else {
                posicionaNavio2(l, c, tabuleiro,direcao);
            }
            clear.screen();
            printaTabuleiros();
        }
    }

    public void posicionaN3(Tabuleiro tabuleiroDefesa,int navio3){
        Scanner input = new Scanner(System.in);
        System.out.println("Posicione os navios do tipo 3.");
        for(int i = 0; i < navio3;i++){

            while(true) {
                System.out.println("digite V para vertical, ou H para horizontal: ");
                char dire = input.next().charAt(0);
                if (dire == 'v' || dire == 'V' || dire == 'h' || dire == 'H') {
                    direcao=dire;
                    break;
                }
            }
            System.out.println("escolha a linha de 1 a 10: ");
            l = input.nextInt() - 1;
            while (l > 9 || l < 0) {
                System.out.println("selecione uma linha valida, entre 1 e 10:");
                l = input.nextInt() - 1;
            }
            System.out.println("escolha a coluna de 1 a 10: ");
            c = input.nextInt() - 1;
            while (c > 9 || c < 0) {
                System.out.println("selecione uma coluna valida, entre 1 e 10:");
                c = input.nextInt() - 1;
            }

            if (tabuleiroDefesa.getTabuleiro()[l][c]>0||tabuleiroDefesa.getTabuleiro()[l+1][c]>0||tabuleiroDefesa.getTabuleiro()[l+2][c]>0||tabuleiroDefesa.getTabuleiro()[l][c+1]>0||tabuleiroDefesa.getTabuleiro()[l][c+2]>0){
                System.out.println("esta posição é inválida!");
                i--;
            }
            else {
                posicionaNavio3(l, c, tabuleiro,direcao);
            }
            clear.screen();
            printaTabuleiros();
        }
    }

    public void posicionaN4(Tabuleiro tabuleiroDefesa,int navio4){
        Scanner input = new Scanner(System.in);
        System.out.println("Posicione os navios do tipo 3.");
        for(int i = 0; i < navio4;i++){

            while(true) {
                System.out.println("digite V para vertical, ou H para horizontal: ");
                char dire = input.next().charAt(0);
                if (dire == 'v' || dire == 'V' || dire == 'h' || dire == 'H') {
                    direcao=dire;
                    break;
                }
            }
            System.out.println("escolha a linha de 1 a 10: ");
            l = input.nextInt() - 1;
            while (l > 9 || l < 0) {
                System.out.println("selecione uma linha valida, entre 1 e 10:");
                l = input.nextInt() - 1;
            }
            System.out.println("escolha a coluna de 1 a 10: ");
            c = input.nextInt() - 1;
            while (c > 9 || c < 0) {
                System.out.println("selecione uma coluna valida, entre 1 e 10:");
                c = input.nextInt() - 1;
            }

            if (tabuleiroDefesa.getTabuleiro()[l][c]>0||tabuleiroDefesa.getTabuleiro()[l+1][c]>0||tabuleiroDefesa.getTabuleiro()[l+2][c]>0||tabuleiroDefesa.getTabuleiro()[l+3][c]>0||tabuleiroDefesa.getTabuleiro()[l][c+3]>0||tabuleiroDefesa.getTabuleiro()[l][c+1]>0||tabuleiroDefesa.getTabuleiro()[l][c+2]>0){
                System.out.println("esta posição é inválida!");
                i--;
            }
            else {
                posicionaNavio4(l, c, tabuleiro,direcao);
            }
            clear.screen();
            printaTabuleiros();
        }
    }

    public void posicionaPT(Tabuleiro tabuleiroDefesa,int portaAvioes){
        Scanner input = new Scanner(System.in);
        System.out.println("Posicione os navios Porta-Aviões.");
        for(int i = 0; i < portaAvioes;i++){
            while(true){
                System.out.println("digite um número de 1 a 4 para rotacionar o Porta-aviões: ");
                int z = input.nextInt();
                if(0<z&&z<5){
                    girar=z;
                    break;
                    }
                }
            System.out.println("escolha a linha de 1 a 10: ");
            l = input.nextInt() - 1;
            while (l > 9 || l < 0) {
                System.out.println("selecione uma linha valida, entre 1 e 10:");
                l = input.nextInt() - 1;
            }
            System.out.println("escolha a coluna de 1 a 10: ");
            c = input.nextInt() - 1;
            while (c > 9 || c < 0) {
                System.out.println("selecione uma coluna valida, entre 1 e 10:");
                c = input.nextInt() - 1;
            }

            if (girar==1&&tabuleiro[c][l]>0||tabuleiro[c][l+1]>0||tabuleiro[c][l+2]>0||tabuleiro[c+1][l+1]>0||tabuleiro[c+2][l+1]>0){
                System.out.println("esta posição é inválida!");
                i--;
            }
            else if(girar==2&&tabuleiro[c][l]>0||tabuleiro[c+1][l]>0||tabuleiro[c+2][l]>0||tabuleiro[c+1][l-1]>0||tabuleiro[c+1][l-2]>0){
                System.out.println("esta posição é inválida!");
                i--;
            }
            else if(girar==3&&tabuleiro[c][l]>0||tabuleiro[c][l+1]>0||tabuleiro[c][l+2]>0||tabuleiro[c-1][l+1]>0||tabuleiro[c-2][l+1]>0){
                System.out.println("esta posição é inválida!");
                i--;
            }
            else if(girar==4&&tabuleiro[c][l]>0||tabuleiro[c+1][l]>0||tabuleiro[c+2][l]>0||tabuleiro[c+1][l+1]>0||tabuleiro[c+1][l+2]>0){
                System.out.println("esta posição é inválida!");
                i--;
            }
            else{
                portaAvioes(l, c, tabuleiro,girar);
            }
            clear.screen();
            printaTabuleiros();
            }
        }
public void posicionaNavios(Tabuleiro tabuleiroDefesa,int navio1, int navio2, int navio3, int navio4, int portaAvioes){
        posicionaN1(tabuleiroDefesa,navio1);
        posicionaN2(tabuleiroDefesa,navio2);
        posicionaN3(tabuleiroDefesa,navio3);
        posicionaN4(tabuleiroDefesa,navio4);
        posicionaPT(tabuleiroDefesa,portaAvioes);
    }


    public void atacar(Tabuleiro tabuleiroDefesa) {
        Scanner pn = new Scanner(System.in);
        printaTabuleiros();
        System.out.println("Posicione os ataques.");
        for (int i = 0; i < 3; i++) {
            while(true){
                System.out.println("escolha a linha de 1 a 10: ");
                int x = pn.nextInt() - 1;
                if(0<=x&&x<10){
                    l=x;
                    break;
                }
            }
            while(true){
                System.out.println("escolha a coluna de 1 a 10: ");
                int y = pn.nextInt() - 1;
                if(0<=y&&y<10){
                    c=y;
                    break;
                }
            }
            posicionaAtaque(l, c, this.tabuleiro);
            clear.screen();
            printaTabuleiros();
        }
        for (int i = 0; i < 10; i++) {                                                                                  //função para acertar
            for (int j = 0; j < 10; j++) {
                if (this.tabuleiro[i][j] <= tabuleiroDefesa.getTabuleiro()[i][j] && (this.tabuleiro[i][j] != 0)) {
                    this.tabuleiro[i][j] = 9;
                    tabuleiroDefesa.setTabuleiro(9, i, j);
                }
            }
        }
        clear.screen();
        System.out.println("os acertos estão marcados como '9', e os erros como '1'");
        printaTabuleiros();
    }

    public int contaAcerto(Tabuleiro tabuleiroDefesa) {
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tabuleiroDefesa.getTabuleiro()[i][j] == 9) {
                    contador++;
                }
            }
        }
        return(contador);
    }
    public int contaNavios(){
        int navios=((getNavio1()*1)+(getNavio2()*2)+(getNavio3()*3)+(getNavio4()*4)+(getPortaAvioes()*5));
        return(navios);
    }
}