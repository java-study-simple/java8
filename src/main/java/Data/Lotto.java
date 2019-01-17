package Data;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Lotto {

    private ArrayList<LottoNumber> lottoNumbers;

    public Lotto(){
        lottoNumbers = new ArrayList<>();
    }

    public void addLottoNumber(LottoNumber lottoNumber){
        if(lottoNumbers.contains(lottoNumber)){
            throw new IllegalArgumentException();
        }else{
            lottoNumbers.add(lottoNumber);
        }

    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(lottoNumbers.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "))
        );
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    public int getMatchHitCount(Lotto lotto){
        return (int) lottoNumbers.stream().filter(lotto::contaions).count();
    }

    private boolean contaions(LottoNumber lottoNumber){
        return lottoNumbers.contains(lottoNumber);
    }
}
