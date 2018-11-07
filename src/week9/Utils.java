package week9;

import java.io.*;
import java.util.Scanner;

public class Utils {
    public static String readContentFromFile(String path) {

        try {
            File file = new File(path);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line ;
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

        try {
            File f = new File(path);
            BufferedWriter fw = new BufferedWriter(new FileWriter(f));
            fw.write(find_word);
            fw.write("\r\n");
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





