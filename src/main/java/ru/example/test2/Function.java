package ru.example.test2;

/**
 * Написать программу, вычисляющую для любых натуральных m и r,
 * таких что r<=m, значение функции F(m,r) = m!/(r!(m-r)!)
 */
public class Function {

    public Function() {
    }

    public int calculate(int m, int r) {
        if (r > m) {
            System.out.println("r more than m!");
            return -1;
        }
        if (m < 0 || r < 0) {
            System.out.println("Not natural numbers!");
            return -1;
        }
        return factor(m)/(factor(r) * factor(m - r));
    }

    private int factor(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
