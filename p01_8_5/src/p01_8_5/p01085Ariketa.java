package p01_8_5;

public class p01085Ariketa {

	public static void main(String[] args) {

		int t = 12345; // Denbora segundotan

		int orduak = t / 3600; // Orduak kalkulatu (1 ordu = 3600 segundu)

		t %= 3600; // Geroztik segundu kopurua gelditu

		int minutuak = t / 60; // Minutuak kalkulatu (1 minutu = 60 segundu)
		int segunduak = t % 60; // Segunduak kalkulatu

		System.out.println("Denbora: " + orduak + " ordu, " + minutuak + " minutu, " + segunduak + " segundu.");





	}
}
