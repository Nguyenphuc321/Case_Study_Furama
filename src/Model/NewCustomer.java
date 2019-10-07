package Model;

import Services.ApplicationRunningInterface;

public class NewCustomer implements ApplicationRunningInterface {
    private String nameCustomer;
    private int ageCustomer;

    public NewCustomer() {
    }

    public NewCustomer(String nameCustomer, int ageCustomer) {
        this.nameCustomer = nameCustomer;
        this.ageCustomer = ageCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public int getAgeCustomer() {
        return ageCustomer;
    }

    public void setAgeCustomer(int ageCustomer) {
        this.ageCustomer = ageCustomer;
    }

    @Override
    public String toString() {
        return "Customer2{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", ageCustomer=" + ageCustomer +
                '}';
    }

    @Override
    public void run() {
    }
}
