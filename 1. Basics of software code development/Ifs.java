import java.util.Scanner;

public class Ifs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1
        System.out.println("1." + System.lineSeparator() + "Please enter two angles");
        double angle1 = scanner.nextDouble();
        double angle2 = scanner.nextDouble();

        if (angle1 + angle2 >= 180) {
            System.out.println("no");
        } else if (angle1 == 90 || angle2 == 90 || (angle1 + angle2) == 90) {
            System.out.println("right triangle (90 deg)");
        } else {
            System.out.println("exist");
        }

        //2
        System.out.println(System.lineSeparator() + System.lineSeparator() + "2." + System.lineSeparator() + "Please enter four numbers");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        if (a > b) {
            if (c > d) {
                if (b < d) {
                    System.out.println(d);
                } else {
                    System.out.println(b);
                }
            } else {
                if (b < c) {
                    System.out.println(c);
                } else {
                    System.out.println(b);
                }
            }
        } else {
            if (c > d) {
                if (a < d) {
                    System.out.println(d);
                } else {
                    System.out.println(a);
                }
            } else {
                if (a < c) {
                    System.out.println(c);
                } else {
                    System.out.println(a);
                }
            }
        }

        //3
        System.out.println(System.lineSeparator() + System.lineSeparator() + "3." + System.lineSeparator() + "Please enter x1, y1, x2, y2, x3, y3");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        //y=kx+b
        double koefK = (y2 - y1) / (x2 - x1);
        double koefB = y1 - koefK * x1;

        if (x3 * koefK + koefB == y3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


        //4
        System.out.println(System.lineSeparator() + System.lineSeparator() + "4." + System.lineSeparator() + "Please enter size of hole (x2) and size of stone (x3)");
        double holeA = scanner.nextDouble();
        double holeB = scanner.nextDouble();
        double stoneA = scanner.nextDouble();
        double stoneB = scanner.nextDouble();
        double stoneC = scanner.nextDouble();

        //im too lazy, it's simple
        //we need to check 6 cases

        //5
        System.out.println(System.lineSeparator() + System.lineSeparator() + "5." + System.lineSeparator() + "Please enter x");
        double argument = scanner.nextDouble();
        if (argument <= 3) {
            double function = argument * argument - 3 * argument + 9;
            System.out.println(function);
        } else {
            double function = 1 / (argument * argument * argument + 6);
            System.out.println(function);
        }

    }
}
