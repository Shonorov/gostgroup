package ru.example.test2;

/**
 * Написать программу, вычисляющую для любых натуральных m и r,
 * таких что r<=m, значение функции F(m,r) = m!/(r!(m-r)!)
 */
public class Function {

    public Function() {
    }

    public int calculate(int m, int r) {
        return m >= r ? fact(m)/(fact(r) * fact(m - r)) : -1;
    }

    private int fact(int number) {
        return number <= 1 ? 1 : number * fact(number - 1) ;
    }
}
