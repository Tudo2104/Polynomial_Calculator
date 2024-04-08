package Business_Logic;

import Polynomial_Representation.*;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Division {

    public static Polynomial div(Polynomial dividend, Polynomial divisor) {
        Polynomial result = new Polynomial();

        Polynomial remainder = new Polynomial();
        remainder.getPolynom().putAll(dividend.getPolynom());



        if(remainder.leadingDegree() < divisor.leadingDegree()){
            JOptionPane.showMessageDialog(null, "First polynom'" + "' has a lower degree than the second.");
            return null;
        }
        else if(remainder.leadingDegree() == 0){
            double leadingCoefficientR = remainder.getPolynom().get(remainder.leadingDegree()).getCoefficient().doubleValue();
            double leadingCoefficientD = divisor.getPolynom().get(remainder.leadingDegree()).getCoefficient().doubleValue();
            result.addMonomial(new DoubleMonomial(0,leadingCoefficientR /leadingCoefficientD));
            return result;
        }
        else{
            double leadingCoefficientR = remainder.getPolynom().get(remainder.leadingDegree()).getCoefficient().doubleValue();
            double leadingCoefficientD ;
            while (remainder.leadingDegree() >= divisor.leadingDegree() && leadingCoefficientR != 0 && remainder.leadingDegree() != 0) {


                int leadingDegreeR = remainder.leadingDegree();
                int leadingDegreeD = divisor.leadingDegree();
                leadingCoefficientR = remainder.getPolynom().get(leadingDegreeR).getCoefficient().doubleValue();
                leadingCoefficientD = divisor.getPolynom().get(leadingDegreeD).getCoefficient().doubleValue();
                double newCoefficient = leadingCoefficientR/ leadingCoefficientD;

                int newDegree = leadingDegreeR - leadingDegreeD;

                Polynomial quotientMonomial = new Polynomial();

                quotientMonomial.addMonomial(new DoubleMonomial(newDegree, newCoefficient));
                result.addMonomial(new DoubleMonomial(newDegree, newCoefficient));

                Multiplication firstOperation = new Multiplication();
                Substraction secondOperation = new Substraction();
                Polynomial term = firstOperation.mul(divisor,quotientMonomial);
                remainder = secondOperation.sub(remainder,term);
                remainder.getPolynom().remove(leadingDegreeR);

            }

            return result;
        }
    }
}
