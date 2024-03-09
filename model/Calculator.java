package model;

/**
 * Calculator
 */
public interface Calculator<T> {
    T getSum(T a, T b);
    T getSubtraction(T a, T b);
    T getMultiplication(T a, T b);
    T getDivision(T a, T b);
    
}