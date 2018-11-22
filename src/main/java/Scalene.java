import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

/**
 * @author YNZ
 */

public class Scalene implements TriangleIdentifier {

    public static Scalene create() {
        return new Scalene();
    }

    @Override
    public boolean identify(double a, double b, double c) {
        Set<Double> sides = Stream.of(a, b, c).collect(toSet());
        return sides.size() == 3;
    }
}
