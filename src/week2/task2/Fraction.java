package week2.task2;

import week2.task1.Task1;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator, denominator;

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;

    }


    public void Minimals(){
        int i = Task1.UCLN(this.getNumerator(),this.getDenominator());
        this.setNumerator(this.getNumerator() / i);
        this.setDenominator(this.getDenominator() / i);
    }
    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        int a = (this.numerator * other.denominator) + (this.denominator * other.numerator);
        int b = this.denominator * other.denominator;
        Fraction x = new Fraction(a,b);
        x.Minimals();
        return x;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int a = (this.numerator * other.denominator) - (this.denominator * other.numerator);
        int b = this.denominator * other.denominator;
        Fraction y = new Fraction(a,b);
        y.Minimals();
        return y;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int a = this.numerator * other.numerator;
        int b = this.denominator * other.denominator;
        Fraction z = new Fraction(a,b);
        z.Minimals();
        return z;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int a = this.numerator * other.denominator;
        int b = this.denominator * other.numerator;
        Fraction t = new Fraction(a,b);
        t.Minimals();
        return t;
    }
    public static void main(String[] args){
        Fraction fraction1 = new Fraction(1,4);
        Fraction fraction2 = new Fraction(1,4);
        Fraction add = fraction1.add(fraction2);
        System.out.println("Phan so moi sau cong la: " + add.getNumerator() + "/" + add.getDenominator());

        Fraction multiply = fraction1.multiply(fraction2);
        System.out.println("Phan so moi sau nhan la: " + multiply.getNumerator() + "/" + multiply.getDenominator());
    }
}

