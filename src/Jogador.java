
import java.util.ArrayList;

public class Jogador {
    
    private final ArrayList<String> tentativas = new ArrayList<>();

    public void adicionarTentativa(String tentativa) {
        tentativas.add(tentativa.toUpperCase());
    }

    public int getNumeroTentativas() {
        return tentativas.size();
    }

    public ArrayList<String> getTentativas() {
        return tentativas;
    }
}
