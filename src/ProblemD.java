import java.util.Scanner;

class ProblemD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] differences = new int[testCases];

        for(int i=0; i<testCases; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] list = new int[n];
            for (int j=0; j<n; j++){
                list[j]=sc.nextInt();
            }
            bubbleSort(list);
            int son = 0;
            for (int l=0; l<k; l++){
               son += list[l];
            }
            int dad = 0;
            for (int t=k; t<n; t++){
                dad+=list[t];
            }
            int difference = dad-son;
            differences[i] = difference;
        }

        for (int results : differences){
            System.out.println(results);
        }
    }
    public static void bubbleSort(int[] bubbles) {
        for (int j = 0; j < bubbles.length; j++) {
            for (int i = 1; i < bubbles.length - j; i++) {
                if (bubbles[i - 1] < bubbles[i]) {
                    //NADA
                } else {
                    int actual = bubbles[i];
                    int anterior = bubbles[i - 1];
                    bubbles[i - 1] = actual;
                    bubbles[i] = anterior;
                }
            }
        }
    }
}
