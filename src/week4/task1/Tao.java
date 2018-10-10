package week4.task1;

public class Tao extends HoaQua{

    public Tao(int soLuong, double giaThanh, String nguonGoc, String noiTieuThu) {
        super(soLuong, giaThanh, nguonGoc, noiTieuThu);
    }

    public void getInfo(){
        System.out.println(" Tao So Luong: " +getSoLuong()+ " Gia Thanh: " +getGiaThanh()+ "  Nguon Goc: " +getNguonGoc()+ "  Noi Tieu Thu: " +getNoiTieuThu());
    }
    public void checkSL(){
        if(getSoLuong() < 600 )
            System.out.println("Doanh nghiep ban Tao nho!!!");
        else if(getSoLuong() < 1200)
            System.out.println("Doanh nghiep ban Tao vua!!!");
        else
            System.out.println("Doanh nghiep ban Tao lon!!!");
    }
    public void Sl(){
        if(getSoLuong() > 800)   setGiaThanh(getGiaThanh() - 5000);
        else if (getSoLuong() >1500) setGiaThanh(getGiaThanh() -10000);
        else setGiaThanh(getGiaThanh() / 2);
        System.out.println("Gia thanh giam con: " + getGiaThanh());
    }
}
