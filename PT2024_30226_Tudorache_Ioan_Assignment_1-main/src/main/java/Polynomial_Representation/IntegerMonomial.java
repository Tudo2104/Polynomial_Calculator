package Polynomial_Representation;

public class IntegerMonomial extends Monomial {
    private int coefficient;

    public IntegerMonomial(int degree, int coefficient) {
        super(degree);
        this.coefficient = coefficient;
    }

    public Integer getCoefficient() {
        return coefficient;
    }
}
