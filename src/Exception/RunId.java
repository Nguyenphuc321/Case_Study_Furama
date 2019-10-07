package Exception;

import java.util.Scanner;

public class RunId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Idhople =false;
        do {
            try {
                System.out.println("nhap id cu the");
                String id = scanner.nextLine();
                IdValidator.kiemtratinhhoplecuaid(id);
                Idhople=true;
            } catch (Exception ex) {
                System.out.println("gia tri cua id khong hop le,vui long nhap lai id " + ex.getMessage());
            }
        } while (!Idhople);
    }
}
