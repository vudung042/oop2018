package week10;

import java.util.*;

public class Task2 {
    public void Swap() {
        double[] a = new double[2000];
        Random rd = new Random();
        for(int i=0;i<1000;i++) {
            a[i] = rd.nextDouble();
        }
        for(int i = 0; i<1000; i++) {
            for (int j = i; j < 1000; j++) {

                if (a[i] > a[j]) {
                    double t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for(int i=0;i<1000;i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args){
        Task2 task2=new Task2();
        task2.Swap();
    }
}

