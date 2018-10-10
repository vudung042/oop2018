package week4.task1;

public class CamSanh extends Cam{

    public CamSanh(int soLuong, double giaThanh, String nguonGoc, String noiTieuThu) {
        super(soLuong, giaThanh, nguonGoc, noiTieuThu);
    }

    @Override
    public void getInfo(){
        System.out.println(" Cam Sanh So Luong: " +getSoLuong()+ " Gia Thanh: " +getGiaThanh()+ "  Nguon Goc: " +getNguonGoc()+ "  Noi Tieu Thu: " +getNoiTieuThu());
    }
    public void checkSL(){
        if(getSoLuong() < 100 )
            System.out.println("Doanh nghiep Cam Sanh nho!!!");
        else if(getSoLuong() < 500)
            System.out.println("Doanh nghiep Cam Sanh vua!!!");
        else
            System.out.println("Doanh nghiep Cam Sanh lon!!!");
    }
    public void Sl(){
        if(getSoLuong() > 500)   setGiaThanh(getGiaThanh() - 5000);
        else if (getSoLuong() >1000) setGiaThanh(getGiaThanh() -8000);
        else setGiaThanh(getGiaThanh() / 2);
        System.out.println("Gia thanh giam con: " + getGiaThanh());
    }
}
