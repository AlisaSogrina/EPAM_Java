import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("input1.txt");
        Scanner scanner = new Scanner(file);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int kratnoe = scanner.nextInt();


        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] % kratnoe == 0) {
                sum += array[i];
            }
        }

        PrintWriter writer = new PrintWriter("output.txt");

        writer.print(sum);

        writer.close();

    }
}

