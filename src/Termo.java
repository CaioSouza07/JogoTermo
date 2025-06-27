
import java.util.Scanner;

public class Termo {
    private final Palavra palavra;
    private final Jogador jogador;
    private final int maxTentativas = 6;

    public Termo(String[] palavras) {
        palavra = new Palavra(palavras);
        jogador = new Jogador();
    }

    public void iniciar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bem vindo ao joguinho do Termo!\n");

            while (jogador.getNumeroTentativas() < maxTentativas) {
                System.out.print("Digite uma palavra de 5 letras: ");
                String tentativa = scanner.nextLine().trim();

                if (tentativa.length() != 5) {
                    System.out.println("A palavra deve ter exatamente 5 letras.\n");
                    continue;
                }

                jogador.adicionarTentativa(tentativa);
                String resultado = palavra.compararTentativa(tentativa);
                System.out.println("Resultado: " + resultado + "\n");

                if (tentativa.equalsIgnoreCase(palavra.getPalavra())) {
                    System.out.println("Parabéns! Você acertou em " + jogador.getNumeroTentativas() + " tentativas!");
                    return;
                }
            }
        }
        System.out.println("Você perdeu! A palavra era: " + palavra.getPalavra());
    }
}
