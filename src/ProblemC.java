import java.util.Arrays;
import java.util.Scanner;

public class ProblemC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        String chain = sc.nextLine();

        String combined = name1 + name2;
        char[] array1 = combined.toCharArray();
        char[] array2 = chain.toCharArray();
        bubbleSort(array1);
        bubbleSort(array2);
        String result = " ";
        if (Arrays.equals(array1, array2)){
            result="YES";
        }else {
            result="NO";
        }
        System.out.println(result);
    }

    public static void bubbleSort(char[] bubbles) {
        for (int j = 0; j < bubbles.length; j++) {
            for (int i = 1; i < bubbles.length - j; i++) {
                if (bubbles[i - 1] < bubbles[i]) {
                    //NADA
                } else {
                    char actual = bubbles[i];
                    char anterior = bubbles[i - 1];
                    bubbles[i - 1] = actual;
                    bubbles[i] = anterior;
                }
            }
        }
    }
}
