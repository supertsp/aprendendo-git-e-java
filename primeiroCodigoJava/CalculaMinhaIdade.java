public class CalculaMinhaIdade {
    public static void main (String[] args) {
        int anoAtual = 2021;
        int anoQueNasci = 1983;
        int idade = anoAtual - anoQueNasci; // +, -, /, *
        String nome = "Tiago";
        
        System.out.println(
            "         Olá " + nome + "!" +
            "\n  Sua idade atual é " + idade + " anos ;)" +
            "\nQue bom que você já mais velho!"
        );
    }
}