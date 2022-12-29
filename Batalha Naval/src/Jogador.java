public class Jogador {
    private String nickname;
    private int pontuacao;

    public String GetNickname(){
        return nickname;
    }
    public int GetPontuacao(){
        return pontuacao;
    }

    public void SetNickname(String nickname){
        if(nickname.length()>0 && nickname.length()<15){
                this.nickname = nickname;
            }
    }
    public void SetPontuacao(int pontuacao){
        this.pontuacao = pontuacao;
    }

    public Jogador(String nickname,int pontuacao){
        this.nickname = nickname;
        this.pontuacao = pontuacao;
    }
}
