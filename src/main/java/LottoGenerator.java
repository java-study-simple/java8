import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LottoGenerator {

    private List<Integer> lottoNumList = new ArrayList<>();
    private List<Lotto> generateLottos = new ArrayList<>();

    public static final int lottoMaxNumber = 45;

    public LottoGenerator() {

        for(int i=1;i<=lottoMaxNumber;i++) {
            lottoNumList.add(i);
        }
    }

    public List<Lotto> generate(int money) {
        Lotto lotto;
        int lottoCount = money/Lotto.price;
        for(int i=0;i<lottoCount;i++) {
            List<Integer> generateLotto = new ArrayList<Integer>();

            Collections.shuffle(lottoNumList);

            for(int j = 0; j< Lotto.lottoMaxSizeNum; j++) {
                generateLotto.add(lottoNumList.get(j));
            }

            Collections.sort(generateLotto);
            lotto = new Lotto(generateLotto);
            generateLottos.add(lotto);
        }

        return generateLottos;
    }

}
