package Polynomial_Representation;

public abstract class Monomial {
    protected int degree;

    public Monomial(int degree) {
        this.degree = degree;
    }
    public int getDegree() {
        return degree;
    }

    public abstract Number getCoefficient();
}
