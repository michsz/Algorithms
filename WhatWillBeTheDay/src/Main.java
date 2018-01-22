import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Please type actual date and numbers of days to add ex. Nd 1: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String [] data = input.split("\\s+");
        String [] weekDay = {"Pn", "Wt", "Sr", "Czw", "Pt", "Sb", "Nd"};

        int i =0;
        while (!data[0].equals(weekDay[i])){
            i++;
        }

        int counter =  Integer.parseInt(data[1]);

        while (counter != 0){
            i++;
            counter--;
            if(i == weekDay.length) i=0;

        }

        System.out.println(weekDay[i]);







    }


}
