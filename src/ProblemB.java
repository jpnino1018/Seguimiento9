import java.util.Scanner;

public class ProblemB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ids = new int[n];
        for (int i=0; i< ids.length; i++){
            ids[i] = sc.nextInt();
        }
        bubbleSort(ids);
        int counter = 0;
        int exception = -1;
        if (ids.length>=0){
            for (int i=0; i<ids.length-1; i++){
                if (ids[i]==ids[i+1]){
                    if (ids[i]==exception){
                        counter=-1;
                        break;
                    }else if(ids[i]==0) {
                        //Nada
                    }else{
                        counter=counter+1;
                        exception=ids[i];
                    }
                }
            }
        }else{
            counter=-1;
        }
        System.out.println(counter);
    }

    public static void bubbleSort(int[] bubbles){
        for (int j = 0; j < bubbles.length; j++) {
            for (int i = 1; i < bubbles.length-j; i++) {
                if (bubbles[i-1]<(bubbles[i])) {
                    //NADA
                }else {
                    int actual = bubbles[i];
                    int anterior = bubbles[i-1];
                    bubbles[i - 1] = actual;
                    bubbles[i] = anterior;
                }
            }
        }
    }
}
