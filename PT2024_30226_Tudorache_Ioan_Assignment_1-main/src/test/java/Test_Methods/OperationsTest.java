package Test_Methods;

import Business_Logic.*;
import Polynomial_Representation.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationsTest {

    @Test
    public void addTest(){
        int firstDegree = 3;
        int firstCoefficient = 5;
        int secondDegree = 3;
        int secondCoefficient = 2;

        Polynomial firstPolynom = new Polynomial();
        Polynomial secondPolynom = new Polynomial();
        Polynomial result = new Polynomial();

        firstPolynom.addMonomial(new IntegerMonomial(firstDegree, firstCoefficient));
        secondPolynom.addMonomial(new IntegerMonomial(secondDegree, secondCoefficient));
        result.addMonomial(new IntegerMonomial(secondDegree, secondCoefficient+firstCoefficient));
        assertEquals(Addition.add(firstPolynom,secondPolynom).toString(), result.toString());
    }

    @Test
    public void subTest(){
        int firstDegree = 3;
        int firstCoefficient = 5;
        int secondDegree = 3;
        int secondCoefficient = 2;

        Polynomial firstPolynom = new Polynomial();
        Polynomial secondPolynom = new Polynomial();
        Polynomial result = new Polynomial();

        firstPolynom.addMonomial(new IntegerMonomial(firstDegree, firstCoefficient));
        secondPolynom.addMonomial(new IntegerMonomial(secondDegree, secondCoefficient));
        result.addMonomial(new IntegerMonomial(secondDegree, -secondCoefficient+firstCoefficient));
        assertEquals(Substraction.sub(firstPolynom,secondPolynom).toString(), result.toString());
    }

    @Test
    public void mulTest(){
        int firstDegree = 3;
        int firstCoefficient = 5;
        int secondDegree = 3;
        int secondCoefficient = 2;

        Polynomial firstPolynom = new Polynomial();
        Polynomial secondPolynom = new Polynomial();
        Polynomial result = new Polynomial();

        firstPolynom.addMonomial(new IntegerMonomial(firstDegree, firstCoefficient));
        secondPolynom.addMonomial(new IntegerMonomial(secondDegree, secondCoefficient));
        result.addMonomial(new DoubleMonomial(secondDegree+firstDegree, secondCoefficient*firstCoefficient));
        assertEquals(Multiplication.mul(firstPolynom,secondPolynom).toString(), result.toString());
    }

    @Test
    public void divTest(){
        int firstDegree = 3;
        int firstCoefficient = 4;
        int secondDegree = 2;
        int secondCoefficient = 2;

        Polynomial firstPolynom = new Polynomial();
        Polynomial secondPolynom = new Polynomial();
        Polynomial result = new Polynomial();

        firstPolynom.addMonomial(new IntegerMonomial(firstDegree, firstCoefficient));
        secondPolynom.addMonomial(new IntegerMonomial(secondDegree, secondCoefficient));
        result.addMonomial(new DoubleMonomial(-secondDegree+firstDegree, firstCoefficient/secondDegree));
        assertEquals(Division.div(firstPolynom,secondPolynom).toString(), result.toString());
    }

    @Test
    public void integTest(){
        int firstDegree = 3;
        int firstCoefficient = 4;

        Polynomial firstPolynom = new Polynomial();
        Polynomial result = new Polynomial();

        firstPolynom.addMonomial(new DoubleMonomial(firstDegree, firstCoefficient));
        result.addMonomial(new DoubleMonomial(1+firstDegree, (double)firstCoefficient/(firstDegree+1)));
        assertEquals(Integration.integ(firstPolynom).toString(), result.toString());
    }


    @Test
    public void difTest(){
        int firstDegree = 3;
        int firstCoefficient = 4;

        Polynomial firstPolynom = new Polynomial();
        Polynomial result = new Polynomial();

        firstPolynom.addMonomial(new DoubleMonomial(firstDegree, firstCoefficient));
        result.addMonomial(new DoubleMonomial(firstDegree-1, firstCoefficient*firstDegree));
        assertEquals(Differentiation.dif(firstPolynom).toString(), result.toString());
    }
}
