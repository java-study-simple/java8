import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    public int inputMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        int money = scanner.nextInt();
        return money;
    }

    public Lotto inputWinLotto() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        List<Integer> lotto = new ArrayList<>();
        for(int i = 0; i< Lotto.lottoMaxSizeNum; i++) {
            int num = scanner.nextInt();
            lotto.add(num);
        }

        Lotto winLotto = new Lotto(lotto);
        return winLotto;
    }

}
