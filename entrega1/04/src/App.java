public class App {
    public static void main(String[] args) throws Exception {
        piramideDeNumeros(7);
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
}
