package week9;

public class Main {
    public static void main(String args[]){
        Utils utils = new Utils();
        utils.readContentFromFile("C:\\Users\\dell\\Downloads\\Test\\Test.txt");
        utils.writeContentToFile("C:\\Users\\dell\\Downloads\\Test\\Test1.txt");
        utils.findFileByName("C:\\Users\\dell\\Downloads\\Test","Test.txt");
    }
}
