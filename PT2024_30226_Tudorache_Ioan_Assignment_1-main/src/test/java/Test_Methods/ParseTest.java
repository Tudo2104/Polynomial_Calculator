package Test_Methods;

import Business_Logic.*;
import Polynomial_Representation.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParseTest {

    @Test
    public void parseTest(){
        int firstDegree = 3;
        int firstCoefficient = 5;
        int secondDegree = 1;
        int secondCoefficient = -2;
        String polynomial = "5x^3 -2x";

        Polynomial result = new Polynomial();
        Polynomial first = new Polynomial();

        result.addMonomial(new DoubleMonomial(firstDegree, firstCoefficient));
        result.addMonomial(new DoubleMonomial(secondDegree, secondCoefficient));
        first.parse(polynomial);

        assertEquals(first.toString(), result.toString());
    }


}
