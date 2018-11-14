package week10;

import java.io.*;
import java.util.*;

public class Task1 {

    public List<String> getAllFunction(String path){

         List<String> a = new ArrayList<String>();
            String line = null;

            try {
                File file = new File(path);
                BufferedReader br = new BufferedReader(new FileReader(file));
                while((line=br.readLine())!=null) {
                if(line.indexOf("static")>0) {
                a.add(line);
            }
        }
        br.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return a;
}
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        ArrayList<String> method1 = (ArrayList<String>) task1.getAllFunction("C:\\Users\\dell\\IdeaProjects\\oop20182\\src\\week9\\Utils.java");
        for (int i = 0; i < method1.size(); i++) {
            System.out.println(method1.get(i));
        }
    }
}
