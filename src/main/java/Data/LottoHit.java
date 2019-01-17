package Data;

import java.util.Arrays;

public enum LottoHit {
        FIRST(6, 200000000),
        SECOND(5, 150000),
        THIRD(4, 50000),
        FORTH(3, 5000),
        FAIL(0, 0);


    private int count;
    private int resultPrice;

    LottoHit(int count, int resultPrice){
        this.count = count;
        this.resultPrice = resultPrice;
    }

    public static LottoHit valueOf(int count) {
        return Arrays.stream(values())
                .filter(lottoHit -> lottoHit.isSameScore(count))
                .findFirst()
                .orElse(FAIL);
    }


    public int getCount() {
        return count;
    }

    public int getResultPrice() {
        return resultPrice;
    }

    private Boolean isSameScore(int count){
        return this.count == count;
    }


}
