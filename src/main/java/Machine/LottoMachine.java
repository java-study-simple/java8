package Machine;


import View.InputView;
import View.ResultView;

import java.util.*;

public class LottoMachine {

    private int price;
    private int maxNum;
    private int lottoMax;
    private List<Integer> lottoNumbers;

    public int getLottMax(){return lottoMax;}

    public LottoMachine(){

        price = 1000;
        maxNum = 45;
        lottoMax = 6;

        lottoNumbers = new ArrayList<>();
        for(int i=1; i< maxNum+1; i++){
            lottoNumbers.add(i);
        }

    }

    public List<List<Integer>> buyLotto(int money){
        int count = money / price;
        List<List<Integer>> result = new LinkedList<>();

        for(int i=0; i< count; i++){
            result.add(shuffleLotto());
        }

        return result;
    }

    private List<Integer> shuffleLotto(){

        List<Integer> list = new LinkedList<>();

        Collections.shuffle(lottoNumbers);

        for(int i=0; i< lottoMax; i++){
            list.add(lottoNumbers.get(i));
        }
        Collections.sort(list);
        return list;

    }

    public void calculateMoney(){

    }

}
