package Machine;


import View.InputView;
import View.ResultView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LottoMachine {

    private int price;
    private int maxNum;
    private List<Integer> lottoNumbers;

    public LottoMachine(){

        price = 1000;
        maxNum = 45;
        lottoNumbers = new ArrayList<>(45);
        for(int i=0; i< maxNum; i++){
            lottoNumbers.set(i, i+1);
        }

    }

    public void shuffleLotto(){

        Collections.shuffle(lottoNumbers);

    }

    public void calculateMoney(){

    }

}
