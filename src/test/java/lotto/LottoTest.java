package lotto;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LottoTest {

    private Lotto lotto;

    @Before
    public void setUp() throws Exception {
        lotto = Lotto.valueOf(Arrays.asList(
                new LottoNo(1),
                new LottoNo(2),
                new LottoNo(3),
                new LottoNo(4),
                new LottoNo(5),
                new LottoNo(6)
        ));
    }

    @Test
    public void contains() {
        assertThat(lotto.contains(new LottoNo(1)), is(true));
    }

    @Test
    public void matchCount() {
        Lotto winLotto = Lotto.valueOf(Arrays.asList(
                new LottoNo(1),
                new LottoNo(2),
                new LottoNo(3),
                new LottoNo(4),
                new LottoNo(20),
                new LottoNo(30)
        ));
        assertThat(lotto.matchCount(winLotto), is(4));
    }
}