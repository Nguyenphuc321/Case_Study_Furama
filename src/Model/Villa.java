package Model;

import Abstract.Servicess;

public class Villa extends Servicess  {

    public static int count = 0;
    private String tieuchuanphong;
    private String motatiennghi;
    private double dientichhoboi;
    private int sotang;

    public Villa() {
       super();
    }

    public Villa(String tendichvu, double dientichsudung, double chiphithue, int songuoitoida, String kieuthue, String tieuchuanphong, String motatiennghi, double dientichhoboi, int sotang) {
        super(tendichvu, dientichsudung, chiphithue, songuoitoida, kieuthue);
        this.tieuchuanphong = tieuchuanphong;
        this.motatiennghi = motatiennghi;
        this.dientichhoboi = dientichhoboi;
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

    public double getDientichhoboi() {
        return dientichhoboi;
    }

    public void setDientichhoboi(double dientichhoboi) {
        this.dientichhoboi = dientichhoboi;
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
                "dien tich ho boi"+this.getDientichhoboi()+
                "kieu thue"+this.getKieuthue();
    }
}
