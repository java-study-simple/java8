import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;


public class LottoGeneratorTest {

    @Test
    public void generate() {
        // given
        LottoGenerator lottoGenerator = new LottoGenerator();

        // when
        ArrayList<Integer> lotto = lottoGenerator.generate();

        // then
        assertThat(lotto.size()).isEqualTo(6);
        System.out.println(lotto);
    }

}