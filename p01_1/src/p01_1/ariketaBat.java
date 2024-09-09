package p01_1;

public class ariketaBat {

	public static char getLetrak() {
		return (char) (Math.random() * 26 + 'a'); // a eta z arteko ausazko karaktere bat itzuliko du
	}

	public static void main(String[] args) {
		System.out.println(getLetrak());
		System.out.println(getLetrak());
		System.out.println(getLetrak());
		System.out.println(getLetrak());

		int a = 'a';
		System.out.println(a); // 'a' karakterearen Unicode balioa erakutsi
		double pi = 3.14;
		System.out.println(pi);
		byte ap = (byte) 200; // -128tik 127rako tartea
		System.out.println(ap);

	}
}