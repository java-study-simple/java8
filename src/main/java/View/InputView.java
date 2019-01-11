package View;

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

    public int[] getHitLottoNumber(){
        int[] arr = new int[6];
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        for(int i=0; i<6; i++){
            arr[i] = sc.nextInt();
        }

        return arr;
    }


}
