package Data;

public class LottoNumber<T> {
    private T number;
    public LottoNumber(T number){ this.number = number;}
    public T getNumber(){return number;}

    @Override
    public String toString() {
        return number.toString();
    }



}
