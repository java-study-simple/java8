package Controller;

import Data.Lotto;
import Machine.LottoMachine;
import View.InputView;
import View.ResultView;

import java.util.List;

public class LottoFlowController{

    private InputView inputView;
    private ResultView resultView;
    private LottoMachine lottoMachine;
    public LottoFlowController(){

        inputView = new InputView();
        resultView = new ResultView();
        lottoMachine = new LottoMachine();

    }
    public void run() {

        List<Lotto> lottoList = lottoMachine.buyLotto(inputView.getMoney());

        resultView.showLottoTicket(lottoList);
        resultView.showHitLottoPercent(lottoMachine.calculateHitMoney(lottoList, inputView.getHitLotto()));
    }
}
