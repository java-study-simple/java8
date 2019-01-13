package lotto;

import java.util.Arrays;

public enum LottoGrade {
    FIRST(6, 200000000),
    SECOND(5, 150000),
    THIRD(4, 50000),
    FORTH(3, 5000),
    FAIL(0, 0);


    private int score;
    private int reward;

    LottoGrade(int score, int reward) {
        this.score = score;
        this.reward = reward;
    }


    public static LottoGrade valueOf(int score) {
        return Arrays.stream(values())
                .filter(lottoGrade -> lottoGrade.isSameScore(score))
                .findFirst()
                .orElse(FAIL);
    }

    public int getReward() {
        return reward;
    }

    public int getScore() {
        return score;
    }

    public boolean isSameScore(int score) {
        return this.score == score;
    }

}
