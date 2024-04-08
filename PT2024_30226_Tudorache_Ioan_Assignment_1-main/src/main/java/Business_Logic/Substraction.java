package Business_Logic;

import Polynomial_Representation.DoubleMonomial;
import Polynomial_Representation.IntegerMonomial;
import Polynomial_Representation.Monomial;
import Polynomial_Representation.Polynomial;

import java.util.Map;

public class Substraction {

    public static Polynomial sub(Polynomial a, Polynomial b) {
        Polynomial result = new Polynomial();

        for (Map.Entry<Integer, Monomial> entry : a.getPolynom().entrySet()) {
            int degree = entry.getKey();
            Monomial monomial = entry.getValue();

            if (monomial instanceof IntegerMonomial) {
                result.addMonomial(new IntegerMonomial(degree, ((IntegerMonomial) monomial).getCoefficient()));
            } else if (monomial instanceof DoubleMonomial) {
                result.addMonomial(new DoubleMonomial(degree, ((DoubleMonomial) monomial).getCoefficient()));
            }
        }

        for (Map.Entry<Integer, Monomial> entry : b.getPolynom().entrySet()) {
            int degree = entry.getKey();
            Monomial monomial = entry.getValue();

            if (result.getPolynom().containsKey(degree)) {
                Number existingCoefficient = result.getPolynom().get(degree).getCoefficient();
                Number coefficientToAdd = monomial.getCoefficient();

                if (existingCoefficient instanceof Integer) {
                    int sum = existingCoefficient.intValue() - coefficientToAdd.intValue();
                    result.addMonomial(new IntegerMonomial(degree, sum));
                } else if (existingCoefficient instanceof Double) {
                    double sum = existingCoefficient.doubleValue() - coefficientToAdd.doubleValue();
                    result.addMonomial(new DoubleMonomial(degree, sum));
                }
            } else {
                Number existingCoefficient = monomial.getCoefficient();

                if (existingCoefficient instanceof Integer) {
                    int sum= -existingCoefficient.intValue();
                    result.addMonomial(new IntegerMonomial(degree, sum));


                } else if (existingCoefficient instanceof Double) {
                    double sum = -existingCoefficient.doubleValue();
                    result.addMonomial(new DoubleMonomial(degree, sum));


                }

            }
        }


        return result;
    }
}
