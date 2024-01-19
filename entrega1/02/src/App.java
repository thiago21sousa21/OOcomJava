public class App {
    public static void main(String[] args) throws Exception {
        fibonatti(10);
    }

    public static void fibonatti(int num) {

        if (num <= 0) {
            System.out.println("Você passou um número inválido");
        } else if (num == 1) {
            System.out.println("[ 0 ]");
        } else if (num == 2) {
            System.out.println("[ 0 1 ]");
        } else {
            String resultSequencia = "[ 0 1";
            int ultima = 1;
            int antUltima = 0;

            for (int i = 2; i < num; i++) {
                int soma = ultima + antUltima;
                resultSequencia += " " + soma;
                antUltima = ultima;
                ultima = soma;
            }

            resultSequencia += " ]";
            System.out.println(resultSequencia);
        }

    }
}
