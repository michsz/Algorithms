import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Please type any word/sentence: ");
        Scanner sc = new Scanner(System.in);
        char [] sentence = sc.nextLine().toCharArray();



        for (int i = 0; i<sentence.length; i++){

            if (!Character.isUpperCase(sentence[i]) || i == 0)
                System.out.print(sentence[i]);
            else
                System.out.print(" " + sentence[i]);





        }



    }
}
