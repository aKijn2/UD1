package p01_8_7;

import java.util.Scanner;

public class p01087AriketaObekuntza {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Diru kopurua: ");

        int euroak = sc.nextInt();

        // 200ko billeteak, 100ko billeteak, 10ko billeteak eta soberan zenbat diru dagoen kalkulatuko du
        int berrehun = euroak / 200;
        int euroak2 = euroak % 200;
        int ehun = euroak2 / 100;
        int euroak3 = euroak2 % 100;
        int hamar = euroak3 / 10;
        int sobera = euroak3 % 10;

        System.out.println("200ko billeteak: " + berrehun);
        System.out.println("100ko billeteak: " + ehun);
        System.out.println("10ko billeteak: " + hamar);
        System.out.println("Soberan: " + sobera + " euro");

    }

}
