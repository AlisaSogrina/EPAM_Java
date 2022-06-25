import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class ChoosingSort {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int arrayIndex = 0; arrayIndex < n - 1; arrayIndex++) {
            int tempMax = array[arrayIndex];
            int tempIndexOfMax = arrayIndex;
            for (int i = arrayIndex + 1; i < n; i++) {
                if (array[i] > tempMax) {
                    tempMax = array[i];
                    tempIndexOfMax = i;
                }
            }
            array[tempIndexOfMax] = array[arrayIndex];
            array[arrayIndex] = tempMax;
        }

        PrintWriter writer = new PrintWriter("output.txt");

        for (int i = 0; i < n; i++) {
            writer.print(array[i] + " ");
        }

        writer.close();
    }
}
