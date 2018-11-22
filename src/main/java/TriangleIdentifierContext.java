/**
 * @author YNZ
 */
public class TriangleIdentifierContext {
    private TriangleIdentifier triangleIdentifier;

    public TriangleIdentifierContext(TriangleIdentifier triangleIdentifier) {
        this.triangleIdentifier = triangleIdentifier;
    }

    public boolean typeOf(double a, double b, double c) {
        return this.triangleIdentifier.identify(a, b, c);
    }
}
