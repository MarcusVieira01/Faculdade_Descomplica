import java.util.Arrays;
import java.util.List;

public class PR3 {
    public static void main(String[] args) {
        List<String> objetos = Arrays.asList("garrafa", "copo"); 

        for(int tam = objetos.size() - 1; tam >= 0; tam--){
            System.out.println(objetos.get(tam) + ",");
        }
    }
}
