package View;

import Data.Lotto;

import java.util.List;

public class ResultView {
    public void showLottoTicket(List<Lotto> lottos) {

        System.out.println(lottos.size() + "개를 구매했습니다.");

        for(Lotto lotto : lottos){
            System.out.println(lotto);
        }
    }

    public void showHitLottoPercent() {

    }
}
