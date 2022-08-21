import java.util.Arrays;
import java.util.Scanner;


public class compilator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.print("Enter equation: ");
        String action = in.nextLine();
        char []newArr = action.toCharArray();
        a = newArr[0] - '0';
        b = newArr[2] - '0';
        char midChar = newArr[1];
        String mid = Character.toString(midChar);
        switch (mid) {
            case "+":
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case "-":
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case "/":
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("division by zero");
                }
                break;
            default:
                System.out.println("Unknown action");
                break;
        }
    }
}
