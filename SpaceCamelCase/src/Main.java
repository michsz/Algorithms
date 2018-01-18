import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Please type any word/sentence: ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().toLowerCase();
        String [] words = sentence.split("\\s+");

        for (String word : words){

            if (word.length() == 1)
                System.out.print(word.toUpperCase());
            else if (word.length()==0)
                System.out.print("");
            else
                System.out.print(word.substring(0,1).toUpperCase() + word.substring(1));


        }










    }

}
