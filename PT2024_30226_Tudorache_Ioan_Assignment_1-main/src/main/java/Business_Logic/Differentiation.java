package Business_Logic;

import Polynomial_Representation.DoubleMonomial;
import Polynomial_Representation.IntegerMonomial;
import Polynomial_Representation.Monomial;
import Polynomial_Representation.Polynomial;

import java.util.Map;

public class Differentiation {

    public static Polynomial dif(Polynomial a) {
        Polynomial result = new Polynomial();


        for (Map.Entry<Integer, Monomial> entry : a.getPolynom().entrySet()) {
            int degree = entry.getKey();
            Monomial monomial = entry.getValue();
            Number existingCoefficient = monomial.getCoefficient();
            if(degree == 0){
                result.addMonomial(new IntegerMonomial(0, 0));
            }
            else{
                if (existingCoefficient instanceof Integer) {
                    existingCoefficient = degree * (int)existingCoefficient;
                    result.addMonomial(new IntegerMonomial(degree-1, (int)existingCoefficient));
                } else if (existingCoefficient instanceof Double) {
                    existingCoefficient = degree * (double)existingCoefficient;
                    result.addMonomial(new DoubleMonomial(degree-1, (double)existingCoefficient));
                }
            }
        }


        return result;
    }
}
