package Machine;

import Data.Lotto;
import Data.LottoNumber;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class LottoMachineTest {

    LottoMachine lottoMachine;
    Lotto lotto;

    public LottoMachineTest(){
        lottoMachine = new LottoMachine();
        lotto = new Lotto();
        lotto.addLottoNumber(new LottoNumber<>(1));
        lotto.addLottoNumber(new LottoNumber<>(2));
        lotto.addLottoNumber(new LottoNumber<>(3));
        lotto.addLottoNumber(new LottoNumber<>(4));
        lotto.addLottoNumber(new LottoNumber<>(5));
        lotto.addLottoNumber(new LottoNumber<>(6));
    }

    @Test
    public void containNumberTest(){
        Lotto comapreLotto = new Lotto();
        comapreLotto.addLottoNumber(new LottoNumber<>(2));
        comapreLotto.addLottoNumber(new LottoNumber<>(4));
        comapreLotto.addLottoNumber(new LottoNumber<>(5));
        comapreLotto.addLottoNumber(new LottoNumber<>(9));
        comapreLotto.addLottoNumber(new LottoNumber<>(12));
        comapreLotto.addLottoNumber(new LottoNumber<>(18));
        assertThat(lotto.getMatchHitCount(comapreLotto)).isEqualTo(3);
    }

    @Test
    public void sameNumberTest(){
        Lotto lotto = new Lotto();
        lotto.addLottoNumber(new LottoNumber<>(1));
        lotto.addLottoNumber(new LottoNumber<>(1));
    }



}