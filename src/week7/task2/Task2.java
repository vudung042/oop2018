package week7.task2;

import java.io.*;
import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NullPointerException;
import java.lang.ClassCastException;


public class Task2 {


    void method1() throws IOException {
        throw new IOException("Loi thiet bi");
}
    void method2() throws ArrayIndexOutOfBoundsException {
        int[] n = new int[5];
        n[10] = 50;
        }
     void  method3() throws ArithmeticException{
        int n = 10, m;
        m = n/0;
     }
     void method4() throws NullPointerException{

         Object object = null;
         object.hashCode();
     }
     void method5() throws FileNotFoundException{
         File file = new File("E://file.txt");
         FileReader fr = new FileReader(file);
     }
     void method6() throws ClassCastException{
        Object number = new Integer(16);
        System.out.println((String)number);
     }

    public static void main(String args[]) {
        Task2 m = new Task2();
        try {

            m.method1();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try{
            m.method2();
        } catch (Exception e){
            System.out.println(e.toString());
        }

        try{
            m.method3();
        } catch (Exception e){
            System.out.println(e.toString());
        }

        try{
            m.method4();
        } catch (Exception e){
            System.out.println(e.toString());
        }

        try{
            m.method5();
        } catch (Exception e){
            System.out.println(e.toString());
        }

        try{
            m.method6();
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
}