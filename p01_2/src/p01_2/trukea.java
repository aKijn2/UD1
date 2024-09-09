package p01_2;

public class trukea {
	public static void main(String[] args) {

		System.out.println("Defektuzko balioa");

		// balioak ezarri
		int a = 5;
		int b = 8;

		System.out.println("a:" + a + " b:" + b);

		System.out.println("Trukea");

		// balioak trukatu
		int tempA = a;
		a = b;
		b = tempA;

		System.out.println("a:" + a + " b:" + b);
	}
}
