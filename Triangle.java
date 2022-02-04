/*
*
* Triangle program.
*
* @author Jakob
* @version 1.0
* @since 2020-11-26
*
*/

/**
* This is the class that contains many functions.
*/
public class Triangle {

    /**
    * Length A.
    */
    private static double lengthA;

    /**
    * Length B.
    */
    private static double lengthB;

    /**
    * Length C.
    */
    private static double lengthC;

    /**
    * The Area.
    */
    private static double area;

    /**
    * Angle A.
    */
    private static double angleA;

    /**
    * Angle B.
    */
    private static double angleB;

    /**
    * Angle C.
    */
    private static double angleC;

    /**
    * The Name.
    */
    private static String name;

    /**
    * The Perimeter.
    */
    private static double perimeter;

    /**
    * The Semiperimeter.
    */
    private static double semiperimeter;

    /**
    * The multiplier to change from radian to degrees.
    */
    private static double degrees;

    /**
    * This is the constructor.
    *
    * @param lengthInputA the inputted length A
    * @param lengthInputB the inputted length B
    * @param lengthInputC the inputted length C
    */
    public Triangle(final double lengthInputA, final double lengthInputB,
                 final double lengthInputC) {
        final int ninetyDegrees = 90;
        final int oneEighty = 180;

        lengthA = lengthInputA;
        lengthB = lengthInputB;
        lengthC = lengthInputC;

        degrees = oneEighty / Math.PI;

        angleA = degrees * (Math.acos((Math.pow(lengthB, 2)
            + Math.pow(lengthC, 2) - Math.pow(lengthA, 2))
            / (2 * lengthB * lengthC)));

        angleB = degrees * (Math.acos((Math.pow(lengthA, 2)
            + Math.pow(lengthC, 2) - Math.pow(lengthB, 2))
            / (2 * lengthA * lengthC)));

        angleC = degrees * (Math.acos((Math.pow(lengthA, 2)
            + Math.pow(lengthB, 2) - Math.pow(lengthC, 2))
            / (2 * lengthA * lengthB)));

        /*
        * Name
        */

        if (angleA < ninetyDegrees && angleB < ninetyDegrees
            && angleC < ninetyDegrees) {
            name = "Acute ";
        }
        else if (angleA > ninetyDegrees || angleB > ninetyDegrees
            || angleC > ninetyDegrees) {
            name = "Obtuse ";
        }
        else {
            name = "Right ";
        }

        if (angleA == angleB && angleB == angleC) {
            name += "Equilateral ";
        }
        else if (angleA == angleB || angleB == angleC
            || angleA == angleC) {
            name += "Isosceles";
        }
        else {
            name += "Scalene";
        }

        perimeter = lengthA + lengthB + lengthC;
        semiperimeter = perimeter / 2;

        area = Math.sqrt(semiperimeter * (semiperimeter - lengthA)
            * (semiperimeter - lengthB) * (semiperimeter - lengthC));
    }

    /**
    * Gets the name.
    *
    * @return returns the name
    */
    public String getName() {
        return name;
    }

    /**
    * Gets the area.
    *
    * @return returns the area
    */
    public double getArea() {
        return area;
    }

    /**
    * Gets Angle A.
    *
    * @return returns Angle A
    */
    public double getAngleA() {
        return angleA;
    }

    /**
    * Gets Angle B.
    *
    * @return returns Angle B
    */
    public double getAngleB() {
        return angleB;
    }

    /**
    * Gets Angle C.
    *
    * @return returns Angle C
    */
    public double getAngleC() {
        return angleC;
    }

    /**
    * Gets the perimeter.
    *
    * @return returns the perimeter
    */
    public double getPerimeter() {
        return perimeter;
    }
}
