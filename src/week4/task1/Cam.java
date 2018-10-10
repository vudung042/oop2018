package week4.task1;

public class Cam extends HoaQua{
    public Cam(int soLuong, double giaThanh, String nguonGoc, String noiTieuThu) {
        super(soLuong, giaThanh, nguonGoc, noiTieuThu);
    }
    @Override
    public void getInfo(){
        System.out.println(" Cam So Luong: " +getSoLuong()+ " Gia Thanh: " +getGiaThanh()+ "  Nguon Goc: " +getNguonGoc()+ "  Noi Tieu Thu: " +getNoiTieuThu());
    }
    public void checkSL(){
        if(getSoLuong() < 400 )
            System.out.println("Doanh nghiep ban Cam nho!!!");
        else if(getSoLuong() < 800)
            System.out.println("Doanh nghiep ban Cam vua!!!");
        else
            System.out.println("Doanh nghiep ban Cam lon!!!");
    }
    public void Sl(){
        if(getSoLuong() > 700)   setGiaThanh(getGiaThanh() - 7000);
        else if (getSoLuong() >1100) setGiaThanh(getGiaThanh() -11000);
        else setGiaThanh(getGiaThanh() / 2);
        System.out.println("Gia thanh giam con: " + getGiaThanh());
    }
}
