package p01_8_6;

public class p01086Ariketa {

	public static char getLetrak() {
		return (char) (Math.random() * 26 + 'a');
	}

	public static void main(String[] args) {

		char zenbakaAleatorioa = getLetrak();

		if (zenbakaAleatorioa == 'a' || zenbakaAleatorioa == 'e' || zenbakaAleatorioa == 'i' || zenbakaAleatorioa == 'o' || zenbakaAleatorioa == 'u') {
			System.out.println("Bokala= " + zenbakaAleatorioa);
		} else {
			System.out.println("Kontsonante= " + zenbakaAleatorioa);
		}
	}
}