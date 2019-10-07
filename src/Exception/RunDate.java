package Exception;

import java.util.Date;
import java.util.Scanner;

public class RunDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean namhople = false;
        do {
            try {
                System.out.println("nhap nam  cu the");
                int nam = scanner.nextInt();
                DateValidator.namhople(nam);
                namhople=true;
            } catch (Exception ex) {
                System.out.println("gia tri nam ma ban nhap vao khong hop le "+ ex.getMessage());
            }
        } while (!namhople);
    }
}
