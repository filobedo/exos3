import java.util.List;
import java.util.Optional;

public class Calcul {
    int result;
    Mod mod;
    List<Integer> data;

    Calcul(List<Integer> data, Mod mod) {
        this.result = 0;
        this.data = data;
        this.mod = mod;
    }

    public void makeCalcul() {
        switch (this.mod) {
            case ADDITION:
                this.result = this.data.stream().reduce(0, Integer::sum);
                break;
            case SUBSTRACTION:
                Optional<Integer> res = this.data.stream().reduce((a, b) -> a - b);
                this.result = res.orElse(0);
                break;
            case MULTIPLICATION:
                this.result = this.data.stream().reduce(1, (a, b) -> a * b);
                break;
            default:
                break;
        }
    }


    public void result() {
        System.out.println(this.result);
    }

}
