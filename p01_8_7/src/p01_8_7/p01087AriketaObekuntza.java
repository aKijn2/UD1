package p01_8_7;

import java.util.Scanner;

public class p01087AriketaObekuntza {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Diru kopurua: ");

        int euroak = sc.nextInt();

        // 200ko billeteak, 20ko billeteak, 10ko billeteak eta soberan zenbat diru dagoen kalkulatuko du
        int berrehun = euroak / 200;
        int euroak2 = euroak % 200;
        int ehun = euroak2 / 20;
        int euroak3 = euroak2 % 20;
        int hamar = euroak3 / 10;
        int sobera = euroak3 % 10;

        System.out.println("200ko billeteak: " + berrehun);
        System.out.println("20ko billeteak: " + ehun);
        System.out.println("10ko billeteak: " + hamar);
        System.out.println("Soberan: " + sobera + " euro");

    }

}
