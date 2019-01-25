
public class LottoWinChecker {

    private int score;

    public int winCheck(Lotto lotto, Lotto winLotto) {
        score=0;
        for(int i=0;i<winLotto.getLotto().size();i++) {
            if(lotto.getLotto().contains(winLotto.getLotto().get(i))) {
                score++;
            }
        }
        return score;
    }
}
