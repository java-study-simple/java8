package lotto;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LottoResultTest {

    private List<Lotto> lottoList;
    private Lotto winLotto;
    private LottoResult lottoResult;

    @Before
    public void setUp() throws Exception {
        Lotto lotto1 = Lotto.valueOf(Arrays.asList(
                new LottoNo(1),
                new LottoNo(2),
                new LottoNo(3),
                new LottoNo(4),
                new LottoNo(5),
                new LottoNo(6)
        ));

        Lotto lotto2 = Lotto.valueOf(Arrays.asList(
                new LottoNo(1),
                new LottoNo(2),
                new LottoNo(3),
                new LottoNo(4),
                new LottoNo(7),
                new LottoNo(8)
        ));

        lottoList = Arrays.asList(lotto1, lotto2);
        winLotto = Lotto.valueOf(Arrays.asList(
                new LottoNo(1),
                new LottoNo(2),
                new LottoNo(3),
                new LottoNo(4),
                new LottoNo(5),
                new LottoNo(6)
        ));

        lottoResult = new LottoResult(lottoList, winLotto);
    }

    @Test
    public void getCount() {
        assertThat(lottoResult.getCount(LottoGrade.FIRST), is(1L));
        assertThat(lottoResult.getCount(LottoGrade.THIRD), is(1L));
        assertThat(lottoResult.getCount(LottoGrade.FAIL), is(0L));
    }

    @Test
    public void getTotalReward() {
        assertThat(lottoResult.getTotalReward(), is(200050000L));
    }

    @Test
    public void investMoney() {
        assertThat(lottoResult.getInvestedMoney(), is(2000L));
    }

    @Test
    public void getRateOfProfit() {
        assertThat(lottoResult.getRateOfProfit(), is(((float)200050000L / 2000L) * 100));
    }


}