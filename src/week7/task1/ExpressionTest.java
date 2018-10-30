package week7.task1;

import java.lang.ArithmeticException;

public class ExpressionTest {
    public static void main(String args[]) {
        try {
            Numeral numeral1 = new Numeral(10);
            Numeral numeral2 = new Numeral(1);
            Numeral numeral3 = new Numeral(2);
            Numeral numeral4 = new Numeral(3);
            Numeral numeral5 = new Numeral(0);

            Square square = new Square(new Addition((new Subtraction(new Square(numeral1), numeral2)), (new Multiplication(numeral3, numeral4))));
            System.out.println(square.toString() + "=" + square.evaluate());
            Division division = new Division(numeral1,numeral5);
            System.out.println(division.evaluate());
        }catch (Exception e){
            System.out.println("Lỗi chia cho 0.");
        }

    }
}