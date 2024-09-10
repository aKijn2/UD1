package p01_8_2;

import java.util.Scanner;

public class zirkunFerentzia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zirkunferentziaren erradioa sartu:");

        float zirkunferentzia = sc.nextInt();

        // Zirkunferentziaren azalera = pi * erradio^2
        double azalera = Math.PI * Math.pow(zirkunferentzia, 2);
		
        System.out.println("Zure azalera: " + azalera + " da.");
    }
}
