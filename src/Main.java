import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = {5,8,9,15,2,5,5,9,2,35,15,5,99,75,2};
        int[] count = new int[list.length];
        System.out.println("Dizi: " + Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            count[i] = 1;
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((j != i) && (list[i] == list[j])) {
                    count[j] = count[i];
                }
            }
        }
        System.out.println("Tekrar eden sayilar");
        for (int i = 0; i < list.length; i++) {
            if ((i != 0) && (count[i] > 1)) {
                System.out.println(list[i] + " sayisi " + count[i] + " kere tekrar edildi");
            }
        }
    }
}