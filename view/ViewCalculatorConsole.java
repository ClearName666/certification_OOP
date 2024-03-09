package view;

/**
 * ViewCalculatorConsole
 */
public class ViewCalculatorConsole implements ViewCalculator<Double> {

    @Override
    public void print(String op, Double a, Double b, Double result) {
        System.out.println(a + op + b + "=" + result);
    }

    
}