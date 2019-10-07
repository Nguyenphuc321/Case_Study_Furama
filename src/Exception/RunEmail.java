package Exception;

import java.util.Scanner;

public class RunEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean emailhople = false;
        do {
            try {
                System.out.println("nhap dia chi email cu the");
                String email = scanner.nextLine();
                EmailValidator.kiemtratinhhoplecuaemailvoidexception(email);
                emailhople=true;
            } catch (Exception ex) {
                System.out.println("gia tri cua email khong hop,vui long nhap lai email " + ex.getMessage());
            }
        } while (!emailhople);
    }
}
