package week4.task1;

public class Main {
    public static void main(String[] args) {
        Cam cam = new Cam(2000, 22000, "Hung Yen", "Ha Noi");
        CamThanhPhong CTP = new CamThanhPhong(1000, 20000, "Trung Quoc", "Viet Nam");
        CamSanh CS = new CamSanh(700, 18000, "Ha Noi", "Sai Gon");
        Tao tao = new Tao(1500, 20000, "Hung Yen", "Ha Noi");

        cam.getInfo();
        cam.checkSL();
        cam.Sl();
        CTP.getInfo();
        CTP.checkSL();
        CTP.Sl();
        CS.getInfo();
        CS.checkSL();
        CS.Sl();
        tao.getInfo();
        tao.checkSL();
        tao.Sl();
    }
}