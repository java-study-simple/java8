package Controller;

import Data.Lotto;
import Machine.LottoMachine;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LottoFlowControllerTest {

    // ??????????????????????????????????????????
    @Test
    public void generateLotto() {

        //given
        LottoMachine lottoMachine = new LottoMachine();

        try{
            //when
            List<Lotto> lottos = lottoMachine.buyLotto(14000);

            //then
            assertNotNull(lottos);

        }catch (IllegalArgumentException e){

        }



    }

}