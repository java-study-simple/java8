package lotto;

import java.util.List;

public class LottoFlowController {
    public static void main(String[] args) {
        LottoInputController inputController = new LottoInputController();
        LottoGenerator lottoGenerator = new LottoGenerator();
        LottoOutputController outputController = new LottoOutputController();

        int money = inputController.inputMoney();
        List<Lotto> lottos = lottoGenerator.generate(money);
        outputController.printLottos(lottos);
        Lotto winLotto = inputController.inputWinLotto();
        outputController.printStatistics(new LottoResult(lottos, winLotto));
    }
}
