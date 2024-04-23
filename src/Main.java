import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> pary = new HashMap<String,String>();
        while (true) {
            System.out.println("Podaj imie partnera: ");
            String imie1 = scanner.nextLine();
            System.out.println("Podaj imie parterki: ");
            String imie2 = scanner.nextLine();

            if (imie1.equals("-") || imie2.equals("-")) {
                break;
            }
            pary.put(imie1, imie2);
        }
        System.out.println("podaj szukane imie");
        String szukam = scanner.nextLine();
        for(String klucz : pary.keySet()){
            String wartosc = pary.get(klucz);
            if(wartosc.equals(szukam)|| klucz.equals(szukam)){
                System.out.println(klucz+" "+wartosc);
            }
        }

    }
}
