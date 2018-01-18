import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b,c,d,e,f,g,h,i,k,l,m,p;

        System.out.print("Please type year you want to check Ester Day date: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();


        int month;
        int day;

        a = year%19;
        b = (int)(year/100);
        c = year%100;
        d = (int) b/4;
        e = b%4;
        f = (int)((b+8)/25);
        g = (int) ((b-f+1)/3);
        h = (19*a+b-d-g+15)%30;
        i = (int)c/4;
        k = (int) c%4;
        l = (32+2*e+2*i-h-k)%7;
        m = (int) (a+11*h+22*l)/451;
        p = (h+l-7*m+114)%31;


        day = p+1;
        month = (int) (h+l-7*m+114)/31;

        if (month == 4){
            System.out.printf("Easter will be %d of April %d", day, year);
        } else {
            System.out.printf("Easter will be %d of March %d", day, year);
        }
    }


}
