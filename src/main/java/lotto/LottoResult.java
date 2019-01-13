package lotto;

import java.util.List;
import java.util.stream.Collectors;

public class LottoResult {
    private List<LottoGrade> lottoGrades;

    public LottoResult(List<Lotto> lottos, Lotto winLotto) {
        lottoGrades = lottos.stream()
                .map(lotto -> LottoGrade.valueOf(lotto.matchCount(winLotto)))
                .collect(Collectors.toList());
    }

    public long getCount(LottoGrade grade) {
        return lottoGrades.stream().filter(lottoGrade -> lottoGrade.equals(grade)).count();
    }

    public long getTotalReward() {
        return lottoGrades.stream().mapToLong(LottoGrade::getReward).sum();
    }

    public float getRateOfProfit() {
        return ((float) getTotalReward() / getInvestedMoney()) * 100;
    }

    public long getInvestedMoney() {
        return lottoGrades.size() * LottoGenerator.UNIT_PRICE;
    }
}
