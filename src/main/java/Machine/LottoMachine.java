package Machine;


import Data.Lotto;
import Data.LottoHit;
import Data.LottoHitPapper;
import Data.LottoNumber;

import java.util.*;

public class LottoMachine {

    public static final int price = 1000;
    public static final int maxNumber = 45;
    public static final int lottoCount = 6;
    private List<Integer> lottoNumbers;

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

        List<Lotto> result = new ArrayList<>();
        for(int i=0; i< count; i++){
            result.add(shuffleLotto());
        }

        return result;
    }

    private Lotto shuffleLotto(){

        Lotto lotto = new Lotto();

        Collections.shuffle(lottoNumbers);

        lottoNumbers.stream()
                .limit(lottoCount)
                .forEach(i -> lotto.addLottoNumber(new LottoNumber<>(i)));

        return lotto;
    }


    public LottoHitPapper calculateHitMoney(List<Lotto> lottoList, Lotto hitLotto){
        LottoHitPapper lottoHitPapper = new LottoHitPapper();
        lottoList.stream().forEach(lotto -> {
            lottoHitPapper.addLottoHitCount(LottoHit.valueOf(lotto.getMatchHitCount(hitLotto)));
        });

        return lottoHitPapper;

    }

}
