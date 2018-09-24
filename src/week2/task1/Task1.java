package week2.task1;
import java.util.Scanner;

public class Task1 {

    public static int UCLN(int a, int b) {
            // TODO: Tính ước chung lớn nhất của 2 số a, b
            if(a==b) return a;
            else {
                if(a>b) a=a-b;
                else  b=b-a;
            }
        return UCLN(a,b);
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if (n == 0)
            return n;
        else if (n == 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String[] args){
        int a,b,n,f0=0,f1=1,f2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao a: ");
        a = scanner.nextInt();
        System.out.println("Nhap vao b: ");
        b = scanner.nextInt();
        System.out.println("Uoc chung lon nhat cua " +a+ " va " +b+" la: "+ UCLN(a,b));

        System.out.println("Nhap vao n: ");
        n = scanner.nextInt();
        System.out.println("Fibonacci thu " +n+ " la " + fibonacci(n));
    }
}
