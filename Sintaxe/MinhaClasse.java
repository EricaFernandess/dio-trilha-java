public class MinhaClasse {
    public static void main(String[] args) {

        String primeiroNome = "Erica";
        String sobrenome = "Fernandes";

        String nomeCompleto = nomeCompleto(primeiroNome, sobrenome);
        System.out.print(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String sobrenome) {
        return primeiroNome.concat(" ").concat(sobrenome);

    }

}
