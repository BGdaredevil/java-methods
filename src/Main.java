import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input");
        String item = sc.nextLine();
        int qty = sc.nextInt();

        System.out.println(shop(item, qty));

//        String command = sc.nextLine();
//        int operand1 = sc.nextInt();
//        int operand2 = sc.nextInt();
//        System.out.println(calculate(command, operand1, operand2));

//        System.out.println(hetNumSign(sc.nextInt()));
//        System.out.println(getGrade(sc.nextDouble()));
//        System.out.println(getTriangle(sc.nextInt()));

    }

    private static String shop(String itemName, int qty) {
        HashMap<String, Double> prices = new HashMap<String, Double>(4);
        prices.put("coffee", 1.50);
        prices.put("water", 1.00);
        prices.put("coke", 1.40);
        prices.put("snacks", 2.00);

        Double price = prices.get(itemName);

        if (price!= null) {
            return  String.format("%.2f", price * qty);
        }

        return  "no Such Item";
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