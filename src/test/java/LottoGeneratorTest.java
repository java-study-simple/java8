import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class LottoGeneratorTest {

    public static final int lottoMaxSizeNum = 6;

    @Test
    public void generate() {
        // given
        LottoGenerator lottoGenerator = new LottoGenerator();

        // when
        List<Integer> lotto = lottoGenerator.generate();

        // then
        assertThat(lotto.size()).isEqualTo(6);
        System.out.println(lotto);

        assertThat(checkDuplicate(lotto)).isEqualTo(true);
    }

    public boolean checkDuplicate(List<Integer> lotto) {
        for(int i=0;i<lottoMaxSizeNum;i++){
            for(int j=i+1;j<lottoMaxSizeNum;j++) {
                if(lotto.get(i)==lotto.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }

}