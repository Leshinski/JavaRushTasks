package bubbleSort;

import java.util.Scanner;
public class Main {
    public static void main(String[] bubble) {

        Scanner console = new Scanner(System.in);
        int i = 0;
        int count = console.nextInt();
        int[] num = new int[count];
        while (i < count) {
            if (console.hasNextInt()) {
                int number = console.nextInt();
                num[i] = number;
                i++;
            } else {
                break;
            }
        }
        for(i = 0; i < count-1; i++) {
            for(int j = i+1; j < count; j++) {
                int tmp;
                if (num[i] < num[j]) {
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }
        for(i = 0; i < count; i++) {
            System.out.println(num[i]);
        }
    }
}
