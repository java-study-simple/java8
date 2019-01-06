import java.util.ArrayList;
import java.util.Scanner;

public class InputView {
    private int buyingLottoAmount;
    private int buyingLottoNum;
    private ArrayList<Lotto> buyingLottoList = new ArrayList<Lotto>();

    public void setBuyingLottoAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        Scanner scanner = new Scanner(System.in);
        this.buyingLottoAmount = scanner.nextInt();
        setBuyingLottoNum(this.buyingLottoAmount);
    }
    public int getBuyingLottoAmount() { return buyingLottoAmount; }

    public int getBuyingLottoNum() { return buyingLottoNum; }

    public void setBuyingLottoList(int lottoNum) {
        for(int i=0;i<lottoNum;i++) {
            Lotto lotto = new Lotto();
            lotto.setLotto(new LottoGenerator().generate());
            buyingLottoList.add(lotto);
        }
    }

    public ArrayList<Lotto> getBuyingLottoList() {
        return buyingLottoList;
    }

    private void setBuyingLottoNum(int amount) {
        buyingLottoNum = amount/1000;
    }


    public void printBuyingLottoNum() {
        buyingLottoNum = getBuyingLottoNum();
        System.out.println(buyingLottoNum+"개를 구매했습니다.");
    }

    public void printBuyingLottoList(ArrayList<Lotto> lottolist) {
        for(int i=0;i<lottolist.size();i++) {
            System.out.print("[");
            for(int j=0;j<lottolist.get(i).getLotto().size();j++) {
                System.out.print(lottolist.get(i).getLotto().get(j));
                if(j!=lottolist.get(i).getLotto().size()-1){
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
