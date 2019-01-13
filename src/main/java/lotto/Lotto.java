package lotto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lotto {
    public static final int LOTTO_NUMBER_COUNT = 6;
    private Set<LottoNo> lottoNumbers;

    private Lotto(List<LottoNo> lottoNumbers) {
        this.lottoNumbers = new HashSet<>(lottoNumbers);
        if (this.lottoNumbers.size() != LOTTO_NUMBER_COUNT)
            throw new IllegalArgumentException("Lotto 번호는 중복되지 않으며, 개수는 6개이여야 합니다.");
    }

    public Set<LottoNo> getLottoNumbers() {
        return lottoNumbers;
    }

    public String toString() {
        return lottoNumbers.stream().map(LottoNo::toString).collect(Collectors.joining(","));
    }

    public static Lotto valueOf(List<LottoNo> lottoNoList) {
        return new Lotto(lottoNoList);
    }

    public int matchCount(Lotto winLotto) {
        return (int) lottoNumbers.stream().filter(winLotto::contains).count();
    }

    boolean contains(LottoNo lottoNo) {
        return lottoNumbers.contains(lottoNo);
    }


}
