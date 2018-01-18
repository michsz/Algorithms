import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Please type any word/sentence: ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        char [] charsArray = sentence.toCharArray();


        for (int i = 0; i < charsArray.length; i++){
            if (i == 0 || i%2==0){
                System.out.print(Character.toString(charsArray[i]).toUpperCase());
            }
            else {
                System.out.print(Character.toString(charsArray[i]).toLowerCase());
            }
        }


    }
}
