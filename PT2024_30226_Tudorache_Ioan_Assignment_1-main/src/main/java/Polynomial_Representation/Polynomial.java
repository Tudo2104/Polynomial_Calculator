package Polynomial_Representation;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Polynomial {

    private Map<Integer, Monomial> polynom;

    public Polynomial() {

        polynom = new HashMap<>();
    }

    public void addMonomial(Monomial mon) {
        polynom.put(mon.getDegree(), mon);
    }
    public Map<Integer,Monomial> getPolynom() {
        return polynom;
    }

    public int leadingDegree() {
        int maxDegree = 0;
        for (Integer degree : polynom.keySet()) {
            if (degree > maxDegree) {
                maxDegree = degree;
            }
        }
        return maxDegree;
    }


    public void parse(String polynomial) {
        String coefficient = "([+-]?\\d*\\.?\\d*)";
        String variable = "[xX]";
        String exponent = "(\\^(-?\\d+))?";
        String polynomialTerm = coefficient + variable + "?" + exponent;

        Pattern pattern = Pattern.compile(polynomialTerm);
        Matcher matcher = pattern.matcher(polynomial);

        while (matcher.find()) {
            String matchedTerm = matcher.group();
            if (matchedTerm.isEmpty()) {
                continue;
            }

            Number coefficientValue = 1;
            int exponentValue = 0;

            Matcher coefficientMatcher = Pattern.compile("(-(?=-x)|(?<!\\^)[+-]?\\d*\\.?\\d+|-)").matcher(matchedTerm);
            if (coefficientMatcher.find()) {
                String coefficientStr = coefficientMatcher.group();
                if (!coefficientStr.isEmpty()) {

                    if(coefficientStr.equals("-")){
                        coefficientValue = -coefficientValue.intValue();
                    }
                    else{
                        coefficientValue = Double.parseDouble(coefficientStr);
                    }


                }
            }

            Matcher exponentMatcher = Pattern.compile("\\^(-?\\d+)").matcher(matchedTerm);
            if (exponentMatcher.find()) {
                exponentValue = Integer.parseInt(exponentMatcher.group(1));
            } else {
                if (matchedTerm.matches("[+-]?\\d*\\.?\\d+")) {
                    exponentValue = 0;
                } else {
                    exponentValue = 1;
                }
            }

            if (coefficientValue instanceof Double) {
                this.addMonomial(new DoubleMonomial(exponentValue, coefficientValue.doubleValue()));
            } else if (coefficientValue instanceof Integer) {
                this.addMonomial(new IntegerMonomial(exponentValue, coefficientValue.intValue()));
            }

        }
    }

    public String toString() {
        int iterator = 0;
        String output = "";
        for (Map.Entry<Integer, Monomial> entry : polynom.entrySet()) {
            iterator++;
            int degree = entry.getKey();
            Monomial monomial = entry.getValue();
            Number coefficient = monomial.getCoefficient();

            if (coefficient.doubleValue() < 0) {
                output += "-" + coefficient + "x^" + degree;
            } else {

                if (iterator > 1) {
                    output += "+";
                }
                output += coefficient + "x^" + degree;
            }
        }
        return output;
    }
}


