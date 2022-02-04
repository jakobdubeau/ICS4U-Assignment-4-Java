/*
*
* The Main.
*
* @author Jakob
* @version 1.0
* @since 2020-11-26
*
*/

import java.util.Scanner;

/**
* This program uses a custom class.
*/
final class Main {

    /**
    * Prevent instantiation.
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Determines if the triangle is valid.
    *
    * @param lengthA the length of A
    * @param lengthB the length of B
    * @param lengthC the length of C
    * @return returns whether it is valid or not
    */
    static boolean isValid(final double lengthA, final double lengthB,
                           final double lengthC) {

        final boolean returnBool;

        if (lengthA + lengthB < lengthC || lengthA + lengthC < lengthB
            || lengthB + lengthC < lengthA) {

            System.out.println("\nInvalid inputs\n");
            returnBool = false;

        }
        else if (lengthA <= 0 || lengthB <= 0 || lengthC <= 0) {
            System.out.println("\nPlease use real lengths\n\n");
            returnBool = false;
        }
        else {

            returnBool = true;
        }
        return returnBool;
    }

    /**
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(final String[] args) {
        boolean triangleValid = false;
        double sideA = 0;
        double sideB = 0;
        double sideC = 0;

        System.out.println("Please input the three sides");
        do {
            try {
                final Scanner inputA = new Scanner(System.in);
                final Scanner inputB = new Scanner(System.in);
                final Scanner inputC = new Scanner(System.in);

                System.out.println("\nSide A: ");
                sideA = inputA.nextDouble();

                System.out.println("\nSide B: ");
                sideB = inputB.nextDouble();

                System.out.println("\nSide C: ");
                sideC = inputC.nextDouble();

            }
            catch (java.util.InputMismatchException ex) {
                System.out.println("Please input again");
            }
            triangleValid = isValid(sideA, sideB, sideC);
        } while (!triangleValid);

        final Triangle fullTriangle = new Triangle(sideA, sideB, sideC);

        System.out.println("The area is: " + fullTriangle.getArea());
        System.out.println("Angle A is: " + fullTriangle.getAngleA());
        System.out.println("Angle B is: " + fullTriangle.getAngleB());
        System.out.println("Angle C is: " + fullTriangle.getAngleC());
        System.out.println("The name is: " + fullTriangle.getName());
        System.out.println("The perimeter is: " + fullTriangle.getPerimeter());

    }
}
