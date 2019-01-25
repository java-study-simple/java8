import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoWinCheckerTest {

    @Test
    public void winCheck() {
        // given
        LottoWinChecker lottoWinChecker = new LottoWinChecker();
        LottoGenerator lottoGenerator = new LottoGenerator();
        //List<Lotto> lottoList = lottoGenerator.generate(1000);
        List<Lotto> lottoList = new ArrayList<Lotto>();
        Lotto winLotto = new Lotto(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6)));
        //List<Integer> winLotto = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        lottoList.add(new Lotto(new ArrayList<Integer>(Arrays.asList(1,5,6,7,8,9))));


        // when

        int result = 0;
        for(int i=0;i<lottoList.size();i++) {
            result = lottoWinChecker.winCheck(lottoList.get(i), winLotto);

            // then
            assertThat(result).isEqualTo(3);
        }

        //when

    }
}
