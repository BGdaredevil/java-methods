import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input");
        int a = Integer.parseInt(sc.nextLine());
        String b = sc.nextLine();
        int c = Integer.parseInt(sc.nextLine());
        System.out.println(calc(a, b.charAt(0), c));

//        int a = sc.nextInt();
//        System.out.println(multipyEvens(a));

//        var a = sc.nextLine();
//        var b = sc.nextLine();
//        System.out.println(getGreater(a, b));

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(mathPower(a, b));

//        String a = sc.nextLine();
//        int b = sc.nextInt();
//        System.out.println(repeater(a, b));

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(getArea(a, b));

//        String item = sc.nextLine();
//        int qty = sc.nextInt();
//
//        System.out.println(shop(item, qty));

//        String command = sc.nextLine();
//        int operand1 = sc.nextInt();
//        int operand2 = sc.nextInt();
//        System.out.println(calculate(command, operand1, operand2));

//        System.out.println(hetNumSign(sc.nextInt()));
//        System.out.println(getGrade(sc.nextDouble()));
//        System.out.println(getTriangle(sc.nextInt()));

    }

    private static double calc(int a, char op, int b) {
        switch (op) {
            case '*' -> {
                return a * b;
            }
            case '/' -> {
                return (double) a / b;
            }

            case '+' -> {
                return a + b;
            }

            case '-' -> {
                return a - b;
            }

        }

        return 0;
    }

    private static int multipyEvens(int num) {
        int[] numAsStr = Arrays.stream((num + "").split("")).mapToInt(Integer::parseInt).toArray();

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < numAsStr.length; i++) {
            if (numAsStr[i] % 2 == 0) {
                evenSum += numAsStr[i];
            } else {
                oddSum += numAsStr[i];
            }
        }

        return evenSum * oddSum;
    }

    private static String getGreater(String a, String b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    private static char getGreater(char a, char b) {
        return a > b ? a : b;
    }

    private static int getGreater(int a, int b) {
        return Math.max(a, b);
    }

    private static int mathPower(int a, int pow) {
        return (int) Math.pow(a, pow);
    }

    private static String repeater(String item, int count) {
        return item.repeat(count);
    }

    private static String getArea(int a, int b) {
        return String.format("%.2f", (double) a * b);
    }

    private static String shop(String itemName, int qty) {
        Map<String, Double> prices = Map.of(
                "coffee", 1.50,
                "water", 1.00,
                "coke", 1.40,
                "snacks", 2.00
        );

        Double price = prices.get(itemName);

        if (price != null) {
            return String.format("%.2f", price * qty);
        }

        return "no Such Item";
    }

    private static double calculate(String comand, int operand1, int operand2) {
        double result = 0;

        switch (comand) {
            case "add" -> result = add(operand1, operand2);
            case "subtract" -> result = subtract(operand1, operand2);
            case "multiply" -> result = mult(operand1, operand2);
            case "divide" -> {
                if (operand2 == 0) {
                    throw new Error("cannot divide by 0");
                }

                return div(operand1, operand2);
            }
        }

        return result;
    }

    private static int add(int operand1, int operand2) {
        return operand1 + operand2;
    }

    private static int subtract(int operand1, int operand2) {
        return operand1 - operand2;
    }

    private static int mult(int operand1, int operand2) {
        return operand1 * operand2;
    }

    private static double div(int operand1, int operand2) {
        return (double) operand1 / operand2;
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