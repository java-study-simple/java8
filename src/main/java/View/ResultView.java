package View;

import java.util.List;

public class ResultView {
    public void showLottoTicket(List<List<Integer>> list, int lottoNumCount){
        int size = list.size();
        System.out.println(size+"개를 구매했습니다.");
        for(int i=0; i< size; i++){
            System.out.print("[");
            for(int j=0; j<lottoNumCount-1; j++){

                System.out.print(list.get(i).get(j)+", ");

            }
            System.out.print(list.get(i).get(lottoNumCount-1));

            System.out.println("]");
        }

    }

    public void showHitLottoPercent(){

    }
}
