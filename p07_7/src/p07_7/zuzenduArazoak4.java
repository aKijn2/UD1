package p07_7;

public class zuzenduArazoak4 {

    public static void main(String[] args) {

        /*Kodea erakutsiko duena da: lehenik 7 eta gero 4*/
		
        int num = 5;
        num += num - 1 * 4 + 1;
        System.out.println(num);

        num = 4;
        num %= 7 * num % 3 * 7;
        System.out.println(num);
    }
}
