package Controller;

import Abstract.Servicess;
import Model.House;
import Model.Room;
import Model.Villa;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddNewService {
    static List<Villa>villas = new ArrayList<Villa>();
    static List<House>houses = new ArrayList<House>();
    static List<Room>rooms = new ArrayList<Room>();
    public static void newVilla(){
        Scanner scanner = new Scanner(System.in);
        Villa villa = new Villa();
        System.out.println("nhap ten dich vu");
        villa.setTendichvu(scanner.nextLine());
        System.out.println("nhap dien tich su dung");
        villa.setDientichsudung(scanner.nextDouble());
        System.out.println("nhap chi phi thue");
        villa.setChiphithue(scanner.nextDouble());
        System.out.println("nhap so luong nguoi thue toi da");
        villa.setSonguoitoida(scanner.nextInt());
        System.out.println("nhap tieu chuan phong");
        scanner.nextLine();
        villa.setTieuchuanphong(scanner.nextLine());
        System.out.println("nhap mo ta tien nghi");
        scanner.nextLine();
        villa.setMotatiennghi(scanner.nextLine());
        System.out.println("nhap dien tich ho boi");
        villa.setDientichhoboi(scanner.nextDouble());
        System.out.println("nhap so tang cho thue");
        villa.setSotang(scanner.nextInt());
        System.out.println(villa.toString());
        villas.add(villa);
    }
    public static void newHouse(){
        Scanner scanner = new Scanner(System.in);
        House house = new House();
        System.out.println("nhap ten dich vu");
        house.setTendichvu(scanner.nextLine());
        System.out.println("nhap dien tich su dung");
        house.setDientichsudung(scanner.nextDouble());
        System.out.println("nhap chi phi thue");
        house.setChiphithue(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("nhap so luong nguoi thue toi da");
        house.setSonguoitoida(scanner.nextInt());
        scanner.nextLine();
        System.out.println("nhap tieu chuan phong");
        house.setTieuchuanphong(scanner.nextLine());
        scanner.nextLine();
        System.out.println("nhap mo ta tien nghi");
        house.setMotatiennghi(scanner.nextLine());
        scanner.nextLine();
        System.out.println("nhap so tang");
        house.setSotang(scanner.nextInt());
        scanner.nextLine();
        System.out.println(house.toString());
        houses.add(house);
    }
    public static void newRoom(){
        Scanner scanner = new Scanner(System.in);
        Room room = new Room();
        System.out.println("nhap ten dich vu");
        room.setTendichvu(scanner.nextLine());
        scanner.nextLine();
        System.out.println("nhap dien tich su dung");
        room.setDientichsudung(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("nhap chi phi thue");
        room.setChiphithue(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("nhap so luong nguoi thue toi da");
        room.setSonguoitoida(scanner.nextInt());
        scanner.nextLine();
        System.out.println("nhap kieu thue");
        room.setKieuthue(scanner.nextLine());
        scanner.nextLine();
        System.out.println("nhap dich vu mien phi di kem");
        room.setDichvumienphidikem(scanner.nextLine());
        scanner.nextLine();
        System.out.println(room.toString());
        rooms.add(room);
    }
}