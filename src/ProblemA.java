import java.util.Scanner;

public class ProblemA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String unsorted = sc.nextLine();
        String[] numbers = unsorted.split("\\+");
        bubbleSort(numbers);

        String sorted = "";

        for ( int i = 0; i< numbers.length; i++){
            sorted +=numbers[i]+ "+";
        }
        sorted=sorted.substring(0, sorted.length()-1);
        System.out.println(sorted);
    }

    public static void bubbleSort(String[] bubbles){
        for (int j = 0; j < bubbles.length; j++) {
            for (int i = 1; i < bubbles.length-j; i++) {
                if (bubbles[i-1].compareTo(bubbles[i]) < 0) {
                    //NADA
                }else {
                    String actual = bubbles[i];
                    String anterior = bubbles[i-1];
                    bubbles[i - 1] = actual;
                    bubbles[i] = anterior;
                }
            }
        }
    }
}
