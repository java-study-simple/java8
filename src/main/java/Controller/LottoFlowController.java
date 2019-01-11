package Controller;

import Machine.LottoMachine;
import View.InputView;
import View.ResultView;

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
         resultView.showLottoTicket(lottoMachine.buyLotto(inputView.getMoney()));
    }
}
