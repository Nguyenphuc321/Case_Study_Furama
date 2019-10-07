package CheckShowInfor;

import Abstract.Servicess;
import Model.House;
import Model.Room;
import Model.Villa;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShowInfor {
    static List<House> houses = new ArrayList<>();
    static List<Room> rooms = new ArrayList<>();
    static List<Villa> villas = new ArrayList<>();
    static {
        houses.add(new House("dich vu massage",12,15000,14,"thue theo thang","phong thoang mat","sach se",5));
        rooms.add(new Room("dich vu nha hang",13,14000,10,"thue theo ngay","cac dich vu an uong"));
        villas.add(new Villa("dich vu khach san",12,13000,9,"thue dai hang","phong rong rai","thoang mat",14.0,5));
    }
    static List<Servicess>servicess = new ArrayList<>();

    public static void show(){

        addList();
        System.out.println("so service:"+servicess.size());
        for (Servicess servicess:servicess){
            System.out.println(servicess.showInfo());
        }
        servicess = new ArrayList<>();

    }
    public static void addList(){
        for (Villa villa:villas){
            servicess.add(villa);
        }
        for (Room room:rooms){
            servicess.add(room);
        }
        for (House house:houses){
            servicess.add(house);
        }
        Collections.sort(servicess, new Comparator<Servicess>() {
            @Override
            public int compare(Servicess o1, Servicess o2) {
                return o1.getTendichvu().compareTo(o2.getTendichvu());
            }
        });
    }
 }


