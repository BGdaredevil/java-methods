import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input");

//        System.out.println(hetNumSign(sc.nextInt()));
//        System.out.println(getGrade(sc.nextDouble()));
        System.out.println(getTriangle(sc.nextInt()));
    }

    private static String getTriangle(int size) {
        String result = "";

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                result += String.format(" %d", j);
            }

            result += "\n";
        }

        for (int i = (size - 1); i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                result += String.format(" %d", j);
            }

            result += "\n";
        }

        return result;
    }

    private static String getGrade(double num) {
        if (num < 3.00) {
            return "Fail";
        }
        if (num < 3.50) {
            return "Poor";
        }
        if (num < 4.50) {
            return "Good";
        }
        if (num < 5.50) {
            return "Very good";
        }

        return "Excellent";
    }

    private static String hetNumSign(int num) {
        if (num < 0) {
            return String.format("the number %d is negative", num);
        }

        if (num > 0) {
            return String.format("the number %d is positive", num);
        }

        return String.format("the number %d is zero", num);
    }
}