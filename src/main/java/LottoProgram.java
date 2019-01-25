import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoProgram {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        LottoGenerator lottoGenerator = new LottoGenerator();
        List<Lotto> generateLottoList;

        int money = inputView.inputMoney();
        generateLottoList = lottoGenerator.generate(money);
        resultView.printLottoCount(money);
        resultView.printGeneratedLotto(generateLottoList);

        Lotto winLotto = inputView.inputWinLotto();
        resultView.printStatistic(new LottoResult(generateLottoList, winLotto));
    }

}
