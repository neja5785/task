package clean.entities;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

public class CalculationOperationsTest {

    @Test
    public void returnsSum_whenAdditionSelected() {
        BigDecimal result = CalculationOperations.ADDITION.calculate(new BigDecimal("10"), new BigDecimal("15"));

        assertEquals(result, new BigDecimal("25"));
    }
}
