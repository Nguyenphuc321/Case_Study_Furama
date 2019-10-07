package Main;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class NewCheck {
    public static void main(String[] args) {
        int dientichsudung;
        double chiphithue;
        int soluongnguoitoida;
        String dichvudikem="massage,karake,food,drink,car";
        int sotangthue;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so ma ban can kiem tra");
        dientichsudung = scanner.nextInt();
        if (dientichsudung>30){
            System.out.println(dientichsudung+"ban da nhap dung so can tim");
        }else{
            System.out.println("ban da nhap sai,vui long nhap lai");
        }
        System.out.println("nhap chi phi thue cua ban");
        chiphithue = scanner.nextDouble();
        if (chiphithue>0){
            System.out.println(chiphithue+":ban da nhap dung ");
        }else{
            System.out.println("ban da nhap sai vui long nhap lai");
        }
        System.out.println("so luong nguoi toi da toi thue la");
        soluongnguoitoida = scanner.nextInt();
        if (soluongnguoitoida>0||soluongnguoitoida<20){
            System.out.println(soluongnguoitoida+"ban da nhap dung so luong nguoi");
        }else{
            System.out.println(soluongnguoitoida+"ban da nhap sai,vui long nhap lai");
        }
        scanner.nextLine();
        System.out.println("moi ban nhap cac dich vu di kem");
        dichvudikem = scanner.nextLine();

        if (dichvudikem=="massage,karake,food,drink,car"){
            System.out.println(dichvudikem+"ban da nhap dung dich vu");
        }else{
            System.out.println("ban da nhap sai dich vu");
        }
        System.out.println("moi ban nhap so tang can thue");
        sotangthue = scanner.nextInt();
        if (sotangthue>0){
            System.out.println(sotangthue+"ban da nhap dung ");
        }else{
            System.out.println(sotangthue+"ban da nhap sai,vui long nhap lai");
        }
    }
}
