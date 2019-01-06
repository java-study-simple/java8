package View;

import java.util.Scanner;

public class InputView{

    private Scanner sc;

    public InputView(){
        sc = new Scanner(System.in);
    }

    public int getInt(String sentence){
        System.out.println(sentence);
        return sc.nextInt();
    }

    public int[] getIntArray(String sentence, int length){
        int[] arr = new int[length];
        System.out.println(sentence);
        for(int i=0; i<length; i++){
            arr[i] = sc.nextInt();
        }

        return arr;
    }


}
