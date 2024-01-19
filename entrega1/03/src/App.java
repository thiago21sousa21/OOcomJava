public class App {
    public static void main(String[] args) throws Exception {
        multiplicaAi(8);
    }

    public static void multiplicaAi(int num) {
        System.out.println("Tabela de multiplicação por " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
