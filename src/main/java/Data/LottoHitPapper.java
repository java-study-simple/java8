package Data;

import Machine.LottoMachine;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class LottoHitPapper {

    private Map<LottoHit, Integer> hitMap;

    public LottoHitPapper(){
        hitMap = new EnumMap<>(LottoHit.class);
        Arrays.stream(LottoHit.values()).forEach(lottoHit -> {
            hitMap.put(lottoHit, 0);
        });
    }

    public void addLottoHitCount(LottoHit lottoHit){
        hitMap.replace(lottoHit, hitMap.get(lottoHit)+1);
    }

    public int getLottoHitCount(LottoHit lottoHit){
        return hitMap.get(lottoHit);
    }

    private int getHitPrice(){
        return Arrays.stream(LottoHit.values()).mapToInt(lottoHit -> hitMap.get(lottoHit) * lottoHit.getResultPrice()).sum();
    }

    public float getHitPriceRate(){
        int sum = getHitPrice();
        int buyLottoPrice = hitMap.values().stream().mapToInt(hitcount -> hitcount).sum() * LottoMachine.price;
        return ((float)sum / buyLottoPrice) * 100;
    }

}
