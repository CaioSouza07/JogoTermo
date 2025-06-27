import java.util.Random;


public class Palavra {

    private final String palavra;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public Palavra(String[] listaPalavras){
        Random rand = new Random();
        this.palavra = listaPalavras[rand.nextInt(listaPalavras.length)].toUpperCase();
    }

    public String getPalavra(){
        return palavra;
    }

    public String compararTentativa(String tentativa){

        StringBuilder resultado = new StringBuilder();

        tentativa = tentativa.toUpperCase();

        for (int i = 0; i < palavra.length(); i++){
            char letra = tentativa.charAt(i);

            if (letra == palavra.charAt(i)){
                resultado.append(ANSI_GREEN).append(letra).append(ANSI_RESET);

            } else if (palavra.contains(String.valueOf(letra))) {
                resultado.append(ANSI_YELLOW + letra + ANSI_RESET);
                
            }else{
                resultado.append(ANSI_RED + letra + ANSI_RESET);
            }

        }

        return resultado.toString();

    }

}
