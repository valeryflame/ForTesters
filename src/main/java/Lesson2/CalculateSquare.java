package Lesson2;

public class CalculateSquare {
    public static void main(String[] args) {
        int square = 0;
        try {
            square = calcRectanleSquare(-1, 3);
        } catch (OneOrBothRectangleSideIsNegativeException e){
            e.printStackTrace();
        }
        System.out.println(square);
    }

    private static int calcRectanleSquare(int sideA, int sideB) throws OneOrBothRectangleSideIsNegativeException {
        if(sideA<=0 || sideB<=0){
            throw new OneOrBothRectangleSideIsNegativeException("One or both side is negative: sida A = "+sideA+" side B = "+sideB);
        }
        return sideA*sideB;
    }
}
