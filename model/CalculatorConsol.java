package model;

public class CalculatorConsol implements Calculator<Double> {
    @Override
    public Double getSum(Double a, Double b) {
        return a+b;
    }
    @Override
    public Double getSubtraction(Double a, Double b) {
        return a-b;
    }
    @Override
    public Double getMultiplication(Double a, Double b) {
        return a * b;
    }
    @Override
    public Double getDivision(Double a, Double b) {
        if (ValidNumber.ValidDivision(b)) {
            return a / b;
        }
        throw new RuntimeException("Деление на 0 невозможно");
    }
}
