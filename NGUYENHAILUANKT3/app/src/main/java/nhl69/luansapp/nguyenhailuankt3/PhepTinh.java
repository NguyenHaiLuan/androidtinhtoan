package nhl69.luansapp.nguyenhailuankt3;

public class PhepTinh {
    private String tenpheptinh, bieutuong;

    public PhepTinh(String tenpheptinh, String bieutuong) {
        this.tenpheptinh = tenpheptinh;
        this.bieutuong = bieutuong;
    }

    public String getTenpheptinh() {
        return tenpheptinh;
    }

    public void setTenpheptinh(String tenpheptinh) {
        this.tenpheptinh = tenpheptinh;
    }

    public String getBieutuong() {
        return bieutuong;
    }

    public void setBieutuong(String bieutuong) {
        this.bieutuong = bieutuong;
    }
}
