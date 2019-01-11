package Machine;


import Data.Lotto;
import Data.LottoNumber;

import java.util.*;

public class LottoMachine {

    static final int price = 1000;
    static final int maxNumber = 45;
    static final int lottoCount = 6;
    private List<Integer> lottoNumbers;
    private List<Lotto> result;

    public int getLottoCount(){return lottoCount;}

    public LottoMachine(){

        lottoNumbers = new ArrayList<>();

        for(int i=1; i< maxNumber+1; i++){
            lottoNumbers.add(i);
        }

    }

    public List<Lotto> buyLotto(int money){

        if(Objects.isNull(money) || money <0){
            throw new IllegalArgumentException();
        }

        int count = money / price;

        result = new ArrayList<>();

        for(int i=0; i< count; i++){
            result.add(shuffleLotto());
        }

        return result;
    }

    private Lotto shuffleLotto(){

        Lotto lotto = new Lotto();

        Collections.shuffle(lottoNumbers);

        for(int i=0; i<lottoCount; i++){
            lotto.addLottoNumber(new LottoNumber<>(lottoNumbers.get(i)));
        }

        return lotto;
    }

    public void calculateMoney(){

    }

}
