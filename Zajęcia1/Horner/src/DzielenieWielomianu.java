import java.util.Scanner;
import java.util.SortedMap;

public class DzielenieWielomianu {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Stopień wielomianu: ");
        int n = Integer.parseInt(myObj.nextLine())+1;  // Read user input

        double [] tab = new double[n];
        for(int i=0;i<n;i++) {
            System.out.print("Podaj współczynniki wielomianu: ");
            tab[i] = Double.parseDouble(myObj.nextLine());  // Read user input
        }

        System.out.print("Podaj dzielnik: ");
        double xo = Double.parseDouble(myObj.nextLine());  // Read user input

        double [] wynik = new double[n];
        double [] temp = new double[n];
        for(int i=0;i<n;i++) {
            if(i==0) {
                wynik[i]=tab[i]*xo;
            }
            else {
                temp[i] = wynik[i-1]*xo;
                wynik[i]= temp[i]+tab[i];
            }
        }

        System.out.println();
        System.out.println("-----------------");
        System.out.println("Wynik dzielenia wielomianu");
        for(int i=0;i<n;i++) {
            if(i==0) {
                System.out.print(tab[i]+"x^"+((n-1)-i));
            }
            else {
                if(tab[i]>=0) System.out.print("+"+tab[i]+"x^"+((n-1)-i));
                else System.out.print(tab[i]+"x^"+((n-1)-i));
            }
        }
        System.out.println();
        System.out.println("Przez wielomian x-"+xo+" to:");

        for(int i=0;i<n;i++) {
            if(i==n-1) System.out.print("+("+wynik[i]+"/x-"+xo+")");
            else {
            if(i==0) {
                System.out.print(wynik[i]+"x^"+((n-2)-i));
            }
            else {
                if(wynik[i]>=0) System.out.print("+"+wynik[i]+"x^"+((n-2)-i));
                else System.out.print(wynik[i]+"x^"+((n-2)-i));
            }
        }}
    }
}