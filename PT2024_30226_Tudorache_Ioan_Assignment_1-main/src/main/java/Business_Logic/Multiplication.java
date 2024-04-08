package Business_Logic;

import Polynomial_Representation.DoubleMonomial;
import Polynomial_Representation.IntegerMonomial;
import Polynomial_Representation.Monomial;
import Polynomial_Representation.Polynomial;

import java.util.Map;

public class Multiplication {

    public static Polynomial mul(Polynomial a, Polynomial b) {
        Polynomial result = new Polynomial();

        for (Map.Entry<Integer, Monomial> entryA : a.getPolynom().entrySet()) {
            int degreeA = entryA.getKey();
            Monomial monomialA = entryA.getValue();

            for (Map.Entry<Integer, Monomial> entryB : b.getPolynom().entrySet()) {
                int degreeB = entryB.getKey();
                Monomial monomialB = entryB.getValue();

                int newDegree = degreeA + degreeB;
                Number newCoefficient = monomialA.getCoefficient().doubleValue() * monomialB.getCoefficient().doubleValue();

                if (newCoefficient instanceof Integer) {
                    result.addMonomial(new IntegerMonomial(newDegree, newCoefficient.intValue()));
                } else if (newCoefficient instanceof Double) {
                    result.addMonomial(new DoubleMonomial(newDegree, newCoefficient.doubleValue()));
                }
            }
        }

        return result;
    }
}
