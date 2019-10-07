package Abstract;

public abstract class  Servicess {
    public static int count = 0;
    private String tendichvu;
    private double dientichsudung;
    private double chiphithue;
    private int songuoitoida;
    private String kieuthue;

    public Servicess() {
        count++;
    }

    public Servicess(String tendichvu, double dientichsudung, double chiphithue, int songuoitoida, String kieuthue) {
        this.tendichvu = tendichvu;
        this.dientichsudung = dientichsudung;
        this.chiphithue = chiphithue;
        this.songuoitoida = songuoitoida;
        this.kieuthue = kieuthue;
    }

    public String getTendichvu() {
        return tendichvu;
    }

    public void setTendichvu(String tendichvu) {
        this.tendichvu = tendichvu;
    }

    public double getDientichsudung() {
        return dientichsudung;
    }

    public void setDientichsudung(double dientichsudung) {
        this.dientichsudung = dientichsudung;
    }

    public double getChiphithue() {
        return chiphithue;
    }

    public void setChiphithue(double chiphithue) {
        this.chiphithue = chiphithue;
    }

    public int getSonguoitoida() {
        return songuoitoida;
    }

    public void setSonguoitoida(int songuoitoida) {
        this.songuoitoida = songuoitoida;
    }

    public String getKieuthue() {
        return kieuthue;
    }

    public void setKieuthue(String kieuthue) {
        this.kieuthue = kieuthue;
    }
    public abstract String showInfo();

}
