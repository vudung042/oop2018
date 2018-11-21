package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
public static <E extends Comparable> E GetMax(ArrayList<E> arr)
{
    E max = arr.get(0);
    for(int i = 1 ; i < arr.size() ; i++) {
        if(arr.get(i).compareTo(max) > 0)
        {
            max = arr.get(i);
        }
    }
    return max;
}
    public static void main(String[] args) {
        ArrayList<Integer> Arr=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=0;i<num;i++)
        {
            Arr.add(scanner.nextInt());
        }
        System.out.println(GetMax(Arr));
    }
}