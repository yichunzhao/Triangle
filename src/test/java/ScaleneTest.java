import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author YNZ
 */
public class ScaleneTest {

    @Test
    public void whenCreate_ThenReturnNotNull() {
        assertNotNull(Scalene.create());
        assertTrue(Scalene.create() instanceof Scalene);
    }

    @Test
    public void whenThreeSidesDifferent_ThenReturnTrue() {
        double a = 3;
        double b = 4;
        double c = 5;

        boolean actual = Scalene.create().identify(a, b, c);
        assertTrue(actual);
    }

    @Test
    public void whenTwoSidesDifferent_ThenReturnFalse() {
        double a = 3;
        double b = 3;
        double c = 5;

        boolean actual = Scalene.create().identify(a, b, c);
        assertFalse(actual);
    }

}