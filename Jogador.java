public class Jogador {
    private String nickname;
    private int pontuacao;

    public String GetNickname(){
        return nickname;
    }
    public int GetPontuacao(){
        return pontuacao;
    }

    //public void SetNickname(){}
    //public void SetPontuacao(){}

    public Jogador(String nickname,int pontuacao/*,int [][] PosicaoDefesa,int [][] posicaoAtaque*/){
        this.nickname = nickname;
        this.pontuacao = pontuacao;
    }
}
