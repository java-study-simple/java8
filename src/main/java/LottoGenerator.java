import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LottoGenerator {
    private ArrayList<Integer> lotto = new ArrayList<Integer>();
    private ArrayList<Integer> generateLotto = new ArrayList<Integer>();

    private void setLottoNumber() {
        for(int i=1;i<=45;i++) {
            lotto.add(i);
        }
    }

    public ArrayList<Integer> generate() {
        setLottoNumber();
        Collections.shuffle(lotto);

        for(int i=0;i<6;i++) {
            generateLotto.add(lotto.get(i));
        }

        Collections.sort(generateLotto);

        return generateLotto;
    }

}
