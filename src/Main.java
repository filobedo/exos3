import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> data = IO.readFile();
        System.out.println(args[0]);
        Mod mod = IO.getMod(args[0]);
        Calcul calcul = new Calcul(data, mod);
        calcul.makeCalcul();
        calcul.result();
        System.out.println("Hello world!");
    }
}