import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoGenerator {

    private List<Integer> lotto = new ArrayList<Integer>();
    private List<Integer> generateLotto = new ArrayList<Integer>();

    public static final int lottoMaxNumber = 45;
    public static final int lottoMaxSizeNum = 6;

    public LottoGenerator() {

        for(int i=1;i<=lottoMaxNumber;i++) {
            lotto.add(i);
        }
    }


    public List<Integer> generate() {
        Collections.shuffle(lotto);

        for(int i=0;i<lottoMaxSizeNum;i++) {
            generateLotto.add(lotto.get(i));
        }

        Collections.sort(generateLotto);

        return generateLotto;
    }

}
