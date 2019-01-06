package Controller;

import Machine.LottoMachine;
import View.InputView;
import View.ResultView;

public class LottoFlowController implements FlowController {

    private InputView inputView;
    private ResultView resultView;
    private LottoMachine lottoMachine;
    public LottoFlowController(){

        inputView = new InputView();
        resultView = new ResultView();
        lottoMachine = new LottoMachine();

    }
    @Override
    public void run() {
         resultView.showLottoTicket(lottoMachine.buyLotto(inputView.getInt("구입금액을 입력해 주세요.")), lottoMachine.getLottMax());


    }
}
