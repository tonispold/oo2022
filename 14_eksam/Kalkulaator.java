import java.util.Scanner;

class Kalkulaator {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Valige tehe: +, -, *, või /");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Sisestage esimene number");
        number1 = input.nextDouble();

        System.out.println("Sisestage teine number");
        number2 = input.nextDouble();

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Valige palun tehe!");
                break;
        }
        input.close();
    }
}
