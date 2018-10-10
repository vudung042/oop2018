package week4.task1;

public class HoaQua {

    private int SoLuong;
    private double GiaThanh;
    private String NguonGoc, NoiTieuThu;
    public HoaQua(int soLuong, double giaThanh, String nguonGoc, String noiTieuThu) {
        SoLuong = soLuong;
        GiaThanh = giaThanh;
        NguonGoc = nguonGoc;
        NoiTieuThu = noiTieuThu;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public double getGiaThanh() {
        return GiaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        GiaThanh = giaThanh;
    }

    public String getNguonGoc() {
        return NguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        NguonGoc = nguonGoc;
    }

    public String getNoiTieuThu() {
        return NoiTieuThu;
    }

    public void setNoiTieuThu(String noiTieuThu) {
        NoiTieuThu = noiTieuThu;
    }
    public void getInfo(){
        System.out.println(" Hoa Qua So Luong: " +SoLuong+ " Gia Thanh: " +GiaThanh+ "  Nguon Goc: " +NguonGoc+ "  Noi Tieu Thu: " +NoiTieuThu);
    }
    public void checkSL(){
        if(SoLuong < 100 )
            System.out.println("Doanh nghiep Ban Hoa Qua nho!!!");
        else if(SoLuong < 500)
            System.out.println("Doanh nghiep Ban Hoa Qua  vua!!!");
        else
            System.out.println("Doanh nghiep Ban Hoa Qua lon!!!");
    }
    public void Sl(){
        if(SoLuong > 400)   GiaThanh = GiaThanh - 4000;
        else if (SoLuong > 800) GiaThanh = GiaThanh -8000;
        else GiaThanh = GiaThanh / 2;
        System.out.println("Gia thanh giam con: " + getGiaThanh());
    }
}
