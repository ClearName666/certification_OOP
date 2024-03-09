package contriller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.CalculatorConsol;
import view.ViewCalculatorConsole;

public class CalculatorComandConsole {
    public void Comand(String op, double a, double b)
    {
        CalculatorConsol calculatorConsol = new CalculatorConsol();
        ViewCalculatorConsole viewCalculatorConsole = new ViewCalculatorConsole();
        switch (op) {
            case "+":
                viewCalculatorConsole.print(op, a, b, calculatorConsol.getSum(a, b));
                break;
            case "-":
                viewCalculatorConsole.print(op, a, b, calculatorConsol.getSubtraction(a, b));
                break;
            case "*":
                viewCalculatorConsole.print(op, a, b, calculatorConsol.getMultiplication(a, b));
                break;
            case "/":
                viewCalculatorConsole.print(op, a, b, calculatorConsol.getDivision(a, b));
                break;
            default:
                System.out.println("Не валидная команда!");
                break;
        }
    }
    public void start() {
        System.out.println("Введите команду вида a+b где a это чисто и b это число а между ними знак +-*/!");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(-?\\d+(\\.\\d+)?)\\s*([+\\-*/])\\s*(-?\\d+(\\.\\d+)?)");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            try {
                double num1 = Double.parseDouble(matcher.group(1));
                double num2 = Double.parseDouble(matcher.group(4));
                String operator = matcher.group(3);
                this.Comand(operator, num1, num2);
                
            } catch (NumberFormatException e) {
                System.out.println("Ошибка при разборе чисел. Пожалуйста, проверьте введенные данные.");
            }
        } else {
            System.out.println("Ошибка: Неверный формат ввода. Убедитесь, что вы ввели выражение правильно.");
        }
        
        scanner.close();
    }
}
