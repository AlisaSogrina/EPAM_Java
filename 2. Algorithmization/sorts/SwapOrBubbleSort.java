import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SwapOrBubbleSort {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        boolean isSorted = false;

        int lastElement = n - 1;
        int temp;

        while (!isSorted) {

            isSorted = true;

            for (int i = 0; i < lastElement; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }
            lastElement--;

        }

        PrintWriter writer = new PrintWriter("output.txt");
        for (int i = 0; i < n; i++) {
            writer.print(array[i] + " ");
        }

        writer.close();
    }
}

