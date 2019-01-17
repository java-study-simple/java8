package View;

import Data.Lotto;
import Data.LottoHit;
import Data.LottoHitPapper;

import java.util.Arrays;
import java.util.List;

public class ResultView {
    public void showLottoTicket(List<Lotto> lottos) {

        System.out.println(lottos.size() + "개를 구매했습니다.");

        for(Lotto lotto : lottos){
            System.out.println(lotto);
        }
    }

    public void showHitLottoPercent(LottoHitPapper lottoHitPapper) {
        System.out.println("당첨 통계");
        System.out.println("=========");

        StringBuilder stringBuilder = new StringBuilder();

        Arrays.stream(LottoHit.values()).limit(4).forEach(hit -> {
            stringBuilder.append(String.format("%d개 일치 (%d원) - %d개\n"
                    ,hit.getCount()
                    ,hit.getResultPrice()
                    ,lottoHitPapper.getLottoHitCount(hit)));
        });
        System.out.print(stringBuilder.toString());
        System.out.println(String.format("총 수익률은 %.1f", lottoHitPapper.getHitPriceRate()) +  "%입니다");
    }
}
