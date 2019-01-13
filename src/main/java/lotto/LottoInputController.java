package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoInputController {

    private Scanner scanner;

    public LottoInputController() {
        this.scanner = new Scanner(System.in);
    }

    public int inputMoney() {
        System.out.println("구입 금액을 입력해 주세요.");
        int money = scanner.nextInt();
        return money;
    }

    public Lotto inputWinLotto() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        List<LottoNo> lottoNoList = new ArrayList<>();
        for (int i = 0; i < Lotto.LOTTO_NUMBER_COUNT; i++)
            lottoNoList.add(new LottoNo(scanner.nextInt()));
        return Lotto.valueOf(lottoNoList);
    }
}
