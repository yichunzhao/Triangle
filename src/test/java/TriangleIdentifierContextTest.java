import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author YNZ
 */
public class TriangleIdentifierContextTest {

    @Test
    public void whenThreeSidesSame_ThenContextReturnTrue() {
        double a = 3;
        double b = 3;
        double c = 3;

        TriangleIdentifierContext identifierContext = new TriangleIdentifierContext(Equilateral.create());
        assertTrue(identifierContext.typeOf(a, b, c));
    }

    @Test
    public void whenThreeSidesSame_ThenContextReturnFalse() {
        double a = 3;
        double b = 5;
        double c = 3;

        TriangleIdentifierContext identifierContext = new TriangleIdentifierContext(Equilateral.create());
        assertFalse(identifierContext.typeOf(a, b, c));
    }


}