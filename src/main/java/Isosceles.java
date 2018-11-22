import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author YNZ
 */
public class Isosceles implements TriangleIdentifier {

    public static Isosceles create() {
        return new Isosceles();
    }

    @Override
    public boolean identify(double a, double b, double c) {
        Set<Double> sides = Stream.of(a, b, c).collect(Collectors.toSet());
        return sides.size() == 2;
    }
}
