import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author YNZ
 */
public class EquilateralTest {

    @Test
    public void whenSidesAreSame_ThenItReturnTrue() {
        double a = 3;
        double b = 3;
        double c = 3;

        boolean actual = Equilateral.create().identify(a, b, c);
        assertTrue(actual);
    }

    @Test
    public void whenSidesAreNotSame_ThenItReturnFalse() {
        double a = 3;
        double b = 5;
        double c = 3;

        boolean actual = Equilateral.create().identify(a, b, c);
        assertFalse(actual);
    }


}