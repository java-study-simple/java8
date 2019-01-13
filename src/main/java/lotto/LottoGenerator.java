package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoGenerator {

    private List<LottoNo> lottoNoList;
    public static final int UNIT_PRICE = 1000;

    public LottoGenerator() {
        lottoNoList = new ArrayList<>();
        for (int i = LottoNo.MIN_LOTTO_NUMBER; i <= LottoNo.MAX_LOTTO_NUMBER; i++)
            lottoNoList.add(LottoNo.valueOf(i));
    }

    public List<Lotto> generate(int money) {
        assertMoney(money);

        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i < money / UNIT_PRICE; i++)
            lottos.add(autoGenerateLotto());

        return lottos;
    }

    public void assertMoney(int money) {
        if (money < UNIT_PRICE)
            throw new IllegalArgumentException("로또를 구매할 가격이 부족합니다.");
    }

    public Lotto autoGenerateLotto() {
        Collections.shuffle(lottoNoList);

        List<LottoNo> result = new ArrayList<>();
        for (int i = 0; i < Lotto.LOTTO_NUMBER_COUNT; i++)
            result.add(lottoNoList.get(i));

        return Lotto.valueOf(result);
    }

}
