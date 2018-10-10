package week4.task1;

public class CamThanhPhong extends Cam{

    public CamThanhPhong(int soLuong, double giaThanh, String nguonGoc, String noiTieuThu) {
        super(soLuong, giaThanh, nguonGoc, noiTieuThu);
    }

    @Override
    public void getInfo(){
        System.out.println(" Cam Thanh Phong So Luong: " +getSoLuong()+ " Gia Thanh: " +getGiaThanh()+ "  Nguon Goc: " +getNguonGoc()+ "  Noi Tieu Thu: " +getNoiTieuThu());
    }
    public void checkSL(){
        if(getSoLuong() < 200 )
            System.out.println("Doanh nghiep ban Cam Thanh Phong nho!!!");
        else if(getSoLuong() < 400)
            System.out.println("Doanh nghiep ban Cam Thanh Phong vua!!!");
        else
            System.out.println("Doanh nghiep ban Cam Thanh Phong lon!!!");
    }
    public void Sl(){
        if(getSoLuong() > 300)   setGiaThanh( getGiaThanh() - 3000);
        else if (getSoLuong() >500) setGiaThanh(getGiaThanh() -5000);
        else setGiaThanh(getGiaThanh() / 2);
        System.out.println("Gia thanh giam con: " + getGiaThanh());
    }

}
