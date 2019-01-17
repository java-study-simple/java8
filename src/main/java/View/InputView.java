package View;

import Data.Lotto;
import Data.LottoNumber;

import java.util.Arrays;
import java.util.Scanner;

public class InputView{

    private Scanner sc;

    public InputView(){
        sc = new Scanner(System.in);
    }

    public int getMoney(){
        System.out.println("구입 금액을 입력해 주세요.");
        return sc.nextInt();
    }

    public Lotto getHitLotto(){
        sc.nextLine();
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        String getNum = sc.nextLine();
        String[] tmp = getNum.split(", |,| ");

        Lotto lotto = new Lotto();
        Arrays.stream(tmp).mapToInt(Integer::parseInt)
                .forEach(i -> {
                    lotto.addLottoNumber(new LottoNumber<>(i));
                });

        return lotto;
    }


}
