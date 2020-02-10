package clean.entities;

import clean.ConsoleInputReader;
import clean.Operations;
import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculationOperationsTest {

    @Test
    public void returnsSum_whenAdditionSelected(){
        BigDecimal result= Operations.add(new BigDecimal(3),new BigDecimal(4));
        assertEquals(result, new BigDecimal(7));
    }
    @Test
    public void returnsSubtract_whenAdditionSelected(){
        BigDecimal result= Operations.subtract(new BigDecimal(5),new BigDecimal(4));
        assertEquals(result, new BigDecimal(1));
    }
    @Test
    public void returnsMultiply_whenAdditionSelected(){
        BigDecimal result= Operations.multiply(new BigDecimal(8),new BigDecimal(2));
        assertEquals(result, new BigDecimal(16));
    }
    @Test
    public void returnsDivide_whenAdditionSelected(){
        BigDecimal result= Operations.divide(new BigDecimal(14),new BigDecimal(2));
        assertEquals(result, new BigDecimal(7));
    }

}
