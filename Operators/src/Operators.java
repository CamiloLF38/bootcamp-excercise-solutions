public class Operators {
    public static void main(String[] args) {

        //Validate even numbers
        System.out.println(isEven(2));
        System.out.println(isEven(13));

        //Validate odd numbers
        System.out.println(isOdd(2));
        System.out.println(isOdd(13));

        //takes two integers and returns the result of a^2 - b^2
        System.out.println(differenceOfSquare(3, 2));
        System.out.println(differenceOfSquare(1, 1));

        //takes two angles of a triangle and calculates the third angle
        System.out.println(thirdAngle(60.0, 60.0));
        System.out.println(thirdAngle(45.0, 90.0));
        System.out.println(thirdAngle(35.0, 50.0));

        //takes 3 parameters length of side a, opposite angle A and opposite angle B
        System.out.println(lawOfSines(5.0, 60.0, 60.0));
    }

    static boolean isEven(int value){
        return value%2 == 0 ? true : false;
    }

    static boolean isOdd(int value){
        return value%2 != 0 ? true : false;
    }

    static int differenceOfSquare(int valueA, int valueB){
        return (valueA * valueA) - (valueB * valueB);
    }

    static double thirdAngle(double angleA, double angleB){
        return 180.0 - (angleA + angleB);
    }

    static double lawOfSines(double lengthSide_a, double oppositeAngleA, double oppositeAngleB){
        return (lengthSide_a * (Math.sin(oppositeAngleB))) / Math.sin(oppositeAngleA);
    }
}
