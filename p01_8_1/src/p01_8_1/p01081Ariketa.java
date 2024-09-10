package p01_8_1;

import java.util.Scanner;

public class p01081Ariketa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Sartu metroko erradioa: ");

        // Zerrenda bat irakurriko du eta zirkunferentzia eta luzera kalkulatuko ditu
        double erradioa = sc.nextDouble();
        double zirkunferentzia = 2 * Math.PI * erradioa;
        double luzera = zirkunferentzia;

        //luzera = 2 X pi X erradioa
        System.out.println("Metroko erradioa: " + erradioa);
        System.out.println("Zirkunferentzia: " + zirkunferentzia);
        System.out.println("Luzera: " + luzera);

        sc.close();

    }

}
