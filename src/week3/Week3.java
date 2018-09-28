package week3;
import java.util.Scanner;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if(m>=n) return m;
        else return n;
    }

    public static int minOfArray(int[] array, int n) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int i=0, min=array[0];
        while ( n > 100){

            if(min>array[i]) min= array[i];
            i++;
        }
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double BMI = 0;
        BMI = (weight) / (height*height);
        if(BMI < 18.5)  return "Thiếu cân";
        else if(BMI>=18.5 && BMI<=22.99) return "Bình thường";
        else if(BMI>=23 && BMI<=24.99) return "Thừa cân";
        else return "Béo phì";
    }

    public static void main(String[] agrs){
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao m: ");
        m = scanner.nextInt();
        System.out.println("Nhap vao n: ");
        n = scanner.nextInt();
        System.out.println("So lon trong hai so la: " + max(m,n));

        int[] arrayx = new int[100];
        int i,k;
        System.out.println("Nhap vao so phan tu mang :");
        k = scanner.nextInt();
        for (i=0;i<k;i++){
            arrayx[i] = scanner.nextInt();
        }
        System.out.println("Gia tri nho nhat cua mang: " + minOfArray(arrayx,k));

        double weight, height;
        System.out.println("Nhap vao can nang: ");
        weight = scanner.nextDouble();
        System.out.println("Nhap vao chieu cao: ");
        height = scanner.nextDouble();
        System.out.println(calculateBMI(weight,height));

    }
}
