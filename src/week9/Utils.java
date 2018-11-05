package week9;

import java.io.*;
import java.util.Scanner;

public class Utils {
    public static String readContentFromFile(String path) {
        File file = new File(path);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
//            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"));
            br.readLine();
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeContentToFile(String path) {
        System.out.println("Nhập xâu cần thêm: ");
        Scanner input = new Scanner(System.in);
        String find_word = input.nextLine();
        File f = new File(path);
        try {
            FileWriter fw = new FileWriter(f);
//            BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f), "UTF8"));
            fw.write("\r\n");
            fw.write(find_word);
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    // cau c chi can them true FileWriter(f,true)//

    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath+"\\"+fileName);
        if (file.exists())
        {
            System.out.println("YES");
            return file;
        }
        else
        {
            System.out.println("NO");
            return null;
        }

    }
}





