import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        duplicadosNao();
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
