package Business_Logic;

import Polynomial_Representation.DoubleMonomial;
import Polynomial_Representation.IntegerMonomial;
import Polynomial_Representation.Monomial;
import Polynomial_Representation.Polynomial;

import java.util.Map;
public class Integration {

    public static Polynomial integ(Polynomial a) {
        Polynomial result = new Polynomial();


        for (Map.Entry<Integer, Monomial> entry : a.getPolynom().entrySet()) {
            int degree = entry.getKey();
            Monomial monomial = entry.getValue();
            Number existingCoefficient = monomial.getCoefficient();

            if(existingCoefficient.equals(0.0) && degree == 0){

                if (existingCoefficient instanceof Integer) {
                    result.addMonomial(new IntegerMonomial(0, 0));
                } else if (existingCoefficient instanceof Double) {
                    result.addMonomial(new DoubleMonomial(0,0));
                }
            }
            else if(degree == 0){

                if (existingCoefficient instanceof Integer) {
                    result.addMonomial(new IntegerMonomial(1, (int)existingCoefficient));
                } else if (existingCoefficient instanceof Double) {
                    result.addMonomial(new DoubleMonomial(1, (double)existingCoefficient));
                }
            }
            else{
                if(existingCoefficient.equals(1)){
                    result.addMonomial(new DoubleMonomial(degree+1, (double)1/(degree+1)));

                }
                else{
                    if (existingCoefficient instanceof Integer) {

                        existingCoefficient =  (int)existingCoefficient/(degree+1);
                        result.addMonomial(new IntegerMonomial(degree+1, (int)existingCoefficient));

                    } else if (existingCoefficient instanceof Double) {
                        existingCoefficient = (double)existingCoefficient/(degree+1);
                        result.addMonomial(new DoubleMonomial(degree+1, (double)existingCoefficient));
                    }
                }
            }
        }


        return result;
    }
}
