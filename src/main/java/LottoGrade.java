
public enum LottoGrade {
    FIRST(6, 200000000),
    SECOND(5, 150000),
    THIRD(4, 50000),
    FOURTH(3, 5000),
    FAIL(0,0);


    private int score;
    private int reward;

    LottoGrade(int score, int reward) {
        this.score = score;
        this.reward = reward;
    }

    public int getScore() {
        return score;
    }

    public static LottoGrade valueOf(int score) {
        for(LottoGrade lottoGrade : LottoGrade.values()) {
            if(lottoGrade.getScore() == score) {
                return lottoGrade;
            }
        }
        return FAIL;
    }

    public int getReward() {
        return reward;
    }

}