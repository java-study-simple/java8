package lotto;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class LottoGeneratorTest {

    private LottoGenerator lottoGenerator;

    @Before
    public void setUp() {
        lottoGenerator = new LottoGenerator();
    }

    @Test
    public void autoGenerate() {
        List<Lotto> lottos = lottoGenerator.generate(14000);
        assertThat(lottos.size(), is(14));
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidInputTest() {
        List<Lotto> lottos = lottoGenerator.generate(1);
    }

    @Test
    public void autoGenerateLotto() {
        Lotto lotto = lottoGenerator.autoGenerateLotto();
        assertThat(lotto.getLottoNumbers().size(), is(6));
    }
}