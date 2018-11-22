import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author YNZ
 */
public class IsoscelesTest {

    @Test
    public void whenCreate_ReturnNotNull() {
        assertNotNull(Isosceles.create());
        assertTrue(Isosceles.create() instanceof Isosceles);
    }

    @Test
    public void whenTwoSidesSame_ThenReturnTrue() {
        double a = 3;
        double b = 5;
        double c = 3;
        boolean actual = Isosceles.create().identify(a, b, c);
        assertTrue(actual);
    }
}