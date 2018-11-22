import java.util.Scanner;

/**
 * @author YNZ
 */
public class TriangleTypeIdentification {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please input side a length");
        double a = sc.nextDouble();

        System.out.println("please input side b length");
        double b = sc.nextDouble();

        System.out.println("please input side c length");
        double c = sc.nextDouble();

        TriangleIdentifierContext identifierContext = new TriangleIdentifierContext(Equilateral.create());
        if (identifierContext.typeOf(a, b, c)) System.out.println("this is an equilateral triangle. ");

        TriangleIdentifierContext identifierContext1 = new TriangleIdentifierContext(Isosceles.create());
        if (identifierContext1.typeOf(a, b, c)) System.out.println("this is an isosceles triangle. ");

        TriangleIdentifierContext identifierContext2 = new TriangleIdentifierContext(Scalene.create());
        if (identifierContext2.typeOf(a, b, c)) System.out.println("this is a scalene triangle. ");

    }
}
