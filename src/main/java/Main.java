import Controller.FlowController;
import Controller.LottoFlowController;

public class Main {

    public static void main(String[] args) {
        FlowController flowController = new LottoFlowController();
        flowController.run();
    }
}
