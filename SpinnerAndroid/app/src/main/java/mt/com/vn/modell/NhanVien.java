package mt.com.vn.modell;

/**
 * Created by ManhHung on 12/5/2016.
 */

public class NhanVien {
    private String ten;
    private String ngayBatDau;
    private int soNgay;

    public NhanVien(String ten, String ngayBatDau, int soNgay) {
        this.ten = ten;
        this.ngayBatDau = ngayBatDau;
        this.soNgay = soNgay;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    @Override
    public String toString() {
        return "Ho ten: " + this.ten + "\n"
                + "Ngay bat dau di" + this.ngayBatDau + "\n"
                + "So ngay cong tac" + this.soNgay;
    }
}
