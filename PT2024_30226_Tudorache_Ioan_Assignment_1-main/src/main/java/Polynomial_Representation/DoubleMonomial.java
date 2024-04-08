package Polynomial_Representation;

public class DoubleMonomial extends Monomial {
    private double coefficient;

    public DoubleMonomial(int degree, double coefficient) {
        super(degree);
        this.coefficient = coefficient;
    }

    public Double getCoefficient() {
        return coefficient;
    }
}
