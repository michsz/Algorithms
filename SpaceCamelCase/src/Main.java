import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Please type any word/sentence: ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String [] words = sentence.split("\\s+");

        for (int i = 0; i<words.length; i++){

            if (words[i].length() == 1)
                System.out.print(words[i].toUpperCase());
            else
                System.out.print(words[i].substring(0,1).toUpperCase() + words[i].substring(1));


        }










    }

}
