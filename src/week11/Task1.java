package week11;


    public class Task1 {
            public static <E extends Comparable> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    E temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] Arr = {4, 1, 9, 3, 12, 20};
        sort(Arr);
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }
    }
    }

