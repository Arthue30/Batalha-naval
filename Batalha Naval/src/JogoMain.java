public class JogoMain {

    public static void main(String[] args) {
        Tabuleiro player1 = new Tabuleiro();
        Tabuleiro player2 = new Tabuleiro();
        player1.printaTabuleiros();
        player1.posicionaNavios();
        player2.printaTabuleiros();
        player2.posicionaNavios();
    }
}
