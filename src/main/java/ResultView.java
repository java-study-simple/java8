import java.util.Arrays;
import java.util.List;

public class ResultView {

    public void printLottoCount(int money) {
        System.out.println(money/Lotto.price+"개를 구매했습니다.");
    }

    public void printGeneratedLotto(List<Lotto> generateLottos) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<generateLottos.size();i++) {
            stringBuilder.append("[ ");
            for(int j=0;j< Lotto.lottoMaxSizeNum;j++) {
                stringBuilder.append(generateLottos.get(i).getLotto().get(j)+" ");
            }
            stringBuilder.append("]\n");
        }
        System.out.println(stringBuilder.toString());
    }


    public void printStatistic(LottoResult lottoResult) {
        List<LottoGrade> lottoGrades = Arrays.asList(
            LottoGrade.FOURTH,
            LottoGrade.THIRD,
            LottoGrade.SECOND,
            LottoGrade.FIRST
        );
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n당첨 통계\n-------\n");
        for(LottoGrade lottoGrade : lottoGrades) {
            stringBuilder.append(lottoGrade.getScore()+"개 일치 ("+lottoGrade.getReward()+"원) - "+lottoResult.getCount(lottoGrade)+"개\n");
        }
        System.out.print(stringBuilder.toString());
        System.out.println(printEarningsRate(lottoResult));
    }

    public String printEarningsRate(LottoResult lottoResult) {
        return String.format("총 수익률은 %.2f",lottoResult.getStatistic())+"%입니다.";
    }
}
