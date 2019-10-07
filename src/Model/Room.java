package Model;

import Abstract.Servicess;

public class Room extends Servicess {
    private String dichvumienphidikem;

    public Room() {
        super();
    }

    public Room(String tendichvu, double dientichsudung, double chiphithue, int songuoitoida, String kieuthue, String dichvumienphidikem) {
        super(tendichvu, dientichsudung, chiphithue, songuoitoida, kieuthue);
        this.dichvumienphidikem = dichvumienphidikem;
    }

    public String getDichvumienphidikem() {
        return dichvumienphidikem;
    }

    public void setDichvumienphidikem(String dichvumienphidikem) {
        this.dichvumienphidikem = dichvumienphidikem;
    }

    @Override
    public String showInfo() {
        return "Ten dich vu" +this.getTendichvu()+
                "dien tich su dung"+this.getDientichsudung()+
                "chi phi thue"+this.getChiphithue()+
                "so nguoi toi da"+this.getSonguoitoida()+
                "kieu thue"+this.getKieuthue()+
                "dich vu mien phi di kem"+this.getDichvumienphidikem();
    }
}
