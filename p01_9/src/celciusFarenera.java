import java.util.Scanner;

public class celciusFarenera {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu temperatura celciusean:");
        double celcius = sc.nextDouble();

        // celcius fareneitara pasatzeko formula
        double celciusFarenheintera = (celcius * 9 / 5) + 32;
        System.out.println("Farenheit: " + celciusFarenheintera);

        System.out.println("Sartu temperatura farenheitan:");
        double farenheint = sc.nextDouble();

        // farenheit celciusera pasatzeko formula
        double farenheintCelciusera = (farenheint - 32) * 5 / 9;
        System.out.println("Celcius: " + farenheintCelciusera);

    }
}
