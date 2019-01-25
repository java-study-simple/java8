import java.util.ArrayList;
import java.util.List;

public class LottoResult {
    private List<LottoGrade> lottoGrades = new ArrayList<>();
    private LottoWinChecker lottoWinChecker;

    public LottoResult(List<Lotto> lottos, Lotto winLotto) {
        lottoWinChecker = new LottoWinChecker();

        for(Lotto lotto : lottos) {
            lottoGrades.add(LottoGrade.valueOf(lottoWinChecker.winCheck(lotto, winLotto)));
        }
    }


    public long getTotalReward() {
        long sum=0;
        for(int i=0;i<lottoGrades.size();i++) {
            sum+=lottoGrades.get(i).getReward();
        }
        return sum;
    }

    public int getTotalScore() {
        int sum=0;
        for(LottoGrade lottoGrade : lottoGrades) {
            if(lottoGrade != LottoGrade.FAIL) {
                sum++;
            }
        }
        return sum;
    }

    public double getInvestMoney() {
        return lottoGrades.size()*Lotto.price;
    }

    public int getCount(LottoGrade grade) {
        int count=0;
        for(LottoGrade lottoGrade : lottoGrades) {
            if(LottoGrade.valueOf(grade.getScore()) == LottoGrade.valueOf(lottoGrade.getScore())) {
                count++;
            }
        }
        return count;
    }

    public double getStatistic() {
        return getTotalReward() / getInvestMoney()*100;
    }
}
