import java.util.List;

public class Lotto {

    private List<Integer> lotto;

    public static final int price = 1000;
    public static final int lottoMaxSizeNum = 6;

    public List<Integer> getLotto() { return this.lotto; }

    public Lotto(List<Integer> lotto) {
        this.lotto = lotto;
    }
}
