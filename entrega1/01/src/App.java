public class App {
    public static void main(String[] args) throws Exception {
        verificaParOuImpar(7);
    }

    public static void verificaParOuImpar(int numb) {
        if (numb % 2 == 1) {
            System.out.println("impar");
        } else {
            System.out.println("par");
        }
    }
}
