public class TriangleClassifier {
    public static String classifyTriangle(int side1, int side2, int side3) {
        if (!isTriangle(side1, side2, side3)) {
            return "NotATriangle";
        } else if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles";
        } else if (isRightTriangle(side1, side2, side3)) {
            return "Right";
        } else {
            return "Scalene";
        }
    }

    private static boolean isTriangle(int side1, int side2, int side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    private static boolean isRightTriangle(int side1, int side2, int side3) {
        int[] sides = {side1, side2, side3};
        java.util.Arrays.sort(sides);
        return sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2];
    }
}