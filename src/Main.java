import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Entre com o segundo numero: ");
        double num2 = sc.nextDouble();

        System.out.println("Escolha uma operação (+, -, *, /):");
        char operation = sc.next().charAt(0);

        double resultado;
        switch (operation) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("ERRO! Divisão por zero");
                }
                break;
            default:
                System.out.println("ERRO! Operação Inválida!");
                break;
        }
        sc.close();
    }
}
