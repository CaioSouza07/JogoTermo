
public class Main {
    public static void main(String[] args) {

        String[] palavras = {
            "piano", "verde", "carta", "limpo", "poder",
            "nuvem", "folha", "linha", "troca", "jogar",
            "dente", "fruta", "barco", "gente", "festa",
            "pedra", "livro", "cinto", "sonho", "plano",
            "casca", "terra", "amigo", "bolsa", "cores",
            "vento", "tempo", "treno", "torre", "chuva",
            "falar", "andar", "beijo", "risco", "cerca",
            "braço", "forno", "feira", "norte", "leste",
            "sulco", "salto", "pular", "linha", "farol",
            "haste", "reino", "olhos", "rosto", "nadar",
            "lutar", "pagar", "ganho", "sorte", "campo",
            "selva", "pente", "lente", "caixa", "troco",
            "cobre", "pobre", "ricoa", "prato", "leite",
            "massa", "vinho", "bicho", "cobra", "lugar",
            "nicho", "ferro", "metal", "limão", "trigo",
            "folga", "brisa", "ciclo", "papel", "tigre",
            "clima", "roupa", "navio", "sinal", "sopro",
            "cinto", "aluno", "autor", "vazio", "cesta",
            "freio", "ponto", "linha", "bolha", "valeu",
            "carro", "banco", "tomar", "fundo", "velho"
        };

        Termo jogo = new Termo(palavras);
        jogo.iniciar();
    }
}
