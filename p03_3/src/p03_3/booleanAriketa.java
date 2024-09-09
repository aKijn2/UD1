package p03_3;

public class booleanAriketa {

    public static void main(String[] args) {

        int adina = 27;
        int ikasketaMaila = 4;
        int diruSarrerak = 29000;

		// Emaitza kondizio horiek betetzen baldin baditu true emango du bestela false.
        boolean emaitza = (adina <= 28) && (ikasketaMaila > 3) && (diruSarrerak > 28000);

        System.out.println(emaitza);
    }
}
