import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        App appInstance = new App();

        System.out.println("O que é esse número?");
        appInstance.verificaParOuImpar(7);

        System.out.println("Fibonatti");
        appInstance.fibonatti(5);

    }

    public static void verificaParOuImpar(int numb) {
        if (numb % 2 == 1) {
            System.out.println("Imper");
        } else {
            System.out.println("Par");
        }
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
