package lotto;

import java.util.Objects;

public class LottoNo {
    private int number;
    public static final int MIN_LOTTO_NUMBER = 1;
    public static final int MAX_LOTTO_NUMBER = 45;

    LottoNo(int number) {
        assertNumber(number);
        this.number = number;
    }

    private void assertNumber(int number) {
        if (number < MIN_LOTTO_NUMBER || number > MAX_LOTTO_NUMBER)
            throw new IllegalArgumentException("로또 번호는 1부터 45 사이의 값만 선택 가능합니다.");
    }

    public static LottoNo valueOf(int number) {
        return new LottoNo(number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNo lottoNo = (LottoNo) o;
        return number == lottoNo.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
