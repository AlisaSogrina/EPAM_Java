import java.time.LocalTime;
import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //1
        System.out.println("1." + System.lineSeparator() + "Please enter three numbers for the calculation");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double meaning = ((a - 3) * b / 2) + c;
        System.out.print("Meaning of the expression (which is specified in the program) is ");
        System.out.printf("%.2f", meaning);

        //2
        System.out.println(System.lineSeparator() + System.lineSeparator() + "2." + System.lineSeparator() + "Please enter three numbers for the calculation");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        meaning = (b + Math.sqrt(b * b - 4 * a * c)) / (2 * a) - a * a * a * c + Math.pow(b, -2);
        if ((b * b - 4 * a * c < 0) || a == 0) {
            System.out.println("irrational answer");
        } else {
            System.out.print("Meaning of the expression (which is specified in the program) is ");
            System.out.printf("%.3f", meaning);
        }

        //3
        System.out.println(System.lineSeparator() + System.lineSeparator() + "3." + System.lineSeparator() + "Please enter two numbers for the calculation");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        meaning = (Math.sin(a) + Math.cos(b)) / (Math.cos(a) - Math.sin(b)) * Math.tan(a * b);
        if (Math.cos(a) == Math.sin(b)) {
            System.out.println("devided by zero");
        } else {
            System.out.print("Meaning of the expression (which is specified in the program) is ");
            System.out.printf("%.3f", meaning);
        }

        //4
        System.out.println(System.lineSeparator() + System.lineSeparator() + "4." + System.lineSeparator() + "Please enter a number nnn,ddd");
        a = scanner.nextDouble();
        if (Double.toString(a).matches("\\d{3}\\.\\d{3}")) {
            int firstPart = (int) a;
            int secondPart = (int) (a * 1000) % 1000;
            //System.out.println(firstPart + " " + secondPart);
            System.out.println(secondPart + firstPart * 0.001);
        } else {
            System.out.println("Wrong format");
        }

        //5
        System.out.println(System.lineSeparator() + System.lineSeparator() + "5." + System.lineSeparator() + "Please enter time in seconds");
        int timeInSec = scanner.nextInt();
        int sec = timeInSec % 60;
        int min = (timeInSec / 60) % 60;
        int hours = (timeInSec / 60) / 60;

        String strSec = (sec < 10) ? "0" + Integer.toString(sec) : Integer.toString(sec);
        String strmin = (min < 10) ? "0" + Integer.toString(min) : Integer.toString(min);
        String strHours = (hours < 10) ? "0" + Integer.toString(hours) : Integer.toString(hours);

        System.out.println(strHours + "ч " + strmin + "мин " + strSec + "c");

    }
}
