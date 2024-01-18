import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        App appInstance = new App();

        System.out.println("O que é esse número?");
        appInstance.verificaParOuImpar(7);
        System.out.print("\n");

        System.out.println("Fibonatti:");
        appInstance.fibonatti(5);
        System.out.print("\n");

        System.out.println("multiplicaAi:");
        appInstance.multiplicaAi(5);
        System.out.print("\n");

        System.out.println("piramide De Numeros: ");
        appInstance.piramideDeNumeros(5);
        System.out.print("\n");

        System.out.println("duplicados Nao: ");
        appInstance.duplicadosNao();
        System.out.print("\n");

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

    public static void multiplicaAi(int num) {
        System.out.println("Tabela de multiplicação por " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

    public static void piramideDeNumeros(int num) {

        if (num <= 0) {
            System.out.println("Precisa ser maior ou igual a 1 !!");
        } else {
            for (int i = 1; i <= num; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" " + i);
                }
                System.out.print("\n");
            }
        }

    }

    public static void duplicadosNao() {

        String[] array1 = { "Morango", "Banana", "Maçã", "Uva", "Caqui" };
        String[] array2 = { "Manga", "Caqui", "Morango", "Amora" };
        List<String> result = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    result.add(array1[i]);
                }
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
