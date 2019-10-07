package Main;


import Model.Villa;
import Services.AddNewService;
import Services.AddNewServiceImpl;

import javax.xml.ws.Service;
import java.util.Scanner;

public class Customer {
    private String nameCustomer;
    private int ngaysinh;
    private String gioitinh;
    private long soCMNN;
    private long soDT;
    private String email;
    private String loaikhach;
    private String address;
    private Service sc;

    public void AddNewCustomerForRen(){
        AddNewService<Villa> addNewService = new AddNewServiceImpl();
        System.out.println("khach hang ban muon them vao su dung dich vu la");
        System.out.println("1:dich vu villa");
        System.out.println("2:dich vu house");
        System.out.println("3 dich vu room");
        System.out.println("--------");
    }

    public static void main(String[] args) {
        int temp;
        Scanner scanner = new Scanner(System.in);
        for (;;){
            System.out.println("1:khach hang muon su dung villa");
            System.out.println("2:khach hang muon su dung house");
            System.out.println("3:khach hang muon su dung room");
            System.out.println("4:ban muon them moi mot khach hang ");
            do {
                System.out.println("bam so de chon:/1/2/3/4");
                temp = scanner.nextInt();
            }while ((temp<1)||(temp>4));
            switch (temp){
                case 1:
                    System.out.println("ban da them mới một khách hàng");
                    break;
                case 2:
                    System.out.println("khach hang muon su dung dich vu house");
                    break;
                case 3:
                    System.out.println("khach hang muon su dung dich vu room");
                    break;
                case 4:
                    System.out.println("khach hang muon su dung dich vu villa");
                    System.exit(0);
                    break;
            }
        }
    }
}
