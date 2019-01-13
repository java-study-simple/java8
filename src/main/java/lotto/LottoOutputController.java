package lotto;

import java.util.Arrays;
import java.util.List;

public class LottoOutputController {
    public void printLottos(List<Lotto> lottoList) {
        System.out.println(lottoList.size() + "개를 구입했습니다.");
        for (Lotto lotto : lottoList)
            printLotto(lotto);
    }

    private void printLotto(Lotto lotto) {
        StringBuffer result = new StringBuffer();
        result.append("[");
        result.append(lotto);
        result.append("]");
        System.out.println(result);
    }

    public void printStatistics(LottoResult lottoResult) {
        System.out.print(getHeader());
        System.out.print(getFigure(lottoResult));
        System.out.print(getRateOfProfit(lottoResult));

    }

    public String getHeader() {
        StringBuffer stringBuffer = new StringBuffer("당첨 통계\n");
        stringBuffer.append("---------\n");
        return stringBuffer.toString();
    }

    public String getFigure(LottoResult lottoResult) {
        List<LottoGrade> lottoGrades = Arrays.asList(
                LottoGrade.FORTH,
                LottoGrade.THIRD,
                LottoGrade.SECOND,
                LottoGrade.FIRST
        );

        StringBuffer stringBuffer = new StringBuffer();
        lottoGrades.forEach(lottoGrade -> stringBuffer.append(String.format("%d 개 일치 (%d원)- %d개\n",
                lottoGrade.getScore(),
                lottoGrade.getReward(),
                lottoResult.getCount(lottoGrade)))
        );

        return stringBuffer.toString();
    }

    public String getRateOfProfit(LottoResult lottoResult) {
        return String.format("총 수익률은 %.2f", lottoResult.getRateOfProfit()) + "%입니다.";
    }
}
