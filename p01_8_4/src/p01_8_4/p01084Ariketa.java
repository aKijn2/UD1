package p01_8_4;

import java.util.Scanner;

public class p01084Ariketa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*Egia, adina 28 edo txikiagoa eta ikasketa-maila hiru 
		 * baino handiagoa bada, 
		 * edo adina 30 baino txikiagoa bada eta diru-sarrerak 
		 * 28.000 eurotik gorakoak badira Faltsua, bestela*/

		System.out.println("Adina:");
		int adina = sc.nextInt();
		System.out.println("Ikasketa-maila:");
		int edukazioa = sc.nextInt();
		boolean erantzuna = (adina <= 28) && (edukazioa > 3);
		System.out.println("Emaitza: " + erantzuna);  

		System.out.println("");   

		System.out.println("Adina:");
		int adina1 = sc.nextInt();
		System.out.println("Diru-sarrera:");
		int dirusarrera = sc.nextInt();
		boolean erantzuna1 = (adina1 >= 30) && (dirusarrera > 28000);

		System.out.println("Emaitza: " + erantzuna1);


		sc.close();


	}
}
