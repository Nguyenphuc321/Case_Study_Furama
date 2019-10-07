package Model;

import Abstract.Servicess;

public class House extends Servicess {
    private String tieuchuanphong;
    private String motatiennghi;
    private int sotang;

    public House() {
        super();
    }

    public House(String tendichvu, double dientichsudung, double chiphithue, int songuoitoida, String kieuthue, String tieuchuanphong, String motatiennghi, int sotang) {
        super(tendichvu, dientichsudung, chiphithue, songuoitoida, kieuthue);
        this.tieuchuanphong = tieuchuanphong;
        this.motatiennghi = motatiennghi;
        this.sotang = sotang;
    }

    public String getTieuchuanphong() {
        return tieuchuanphong;
    }

    public void setTieuchuanphong(String tieuchuanphong) {
        this.tieuchuanphong = tieuchuanphong;
    }

    public String getMotatiennghi() {
        return motatiennghi;
    }

    public void setMotatiennghi(String motatiennghi) {
        this.motatiennghi = motatiennghi;
    }

    public int getSotang() {
        return sotang;
    }

    public void setSotang(int sotang) {
        this.sotang = sotang;
    }

    @Override
    public String showInfo() {
        return "Ten dich vu" +this.getTendichvu()+
                "dien tich su dung"+this.getDientichsudung()+
                "chi phi thue"+this.getChiphithue()+
                "so nguoi toi da"+this.getSonguoitoida()+
                "kieu thue"+this.getKieuthue()+
                "tieu chuan phong"+this.getTieuchuanphong()+
                "mo ta tien nghi"+this.getMotatiennghi()+
                "so tang"+this.getSotang();
    }
}
