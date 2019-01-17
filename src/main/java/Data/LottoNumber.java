package Data;

public class LottoNumber<T> {
    private T number;
    public LottoNumber(T number){ this.number = number;}

    @Override
    public String toString() {
        return number.toString();
    }

    @Override
    public boolean equals(Object obj) {
        LottoNumber lottoNumber = (LottoNumber) obj;
        return number == lottoNumber.number;
    }
}
