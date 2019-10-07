package Main;

import Abstract.Servicess;
import Controller.AddNewService;
import Model.House;
import Model.Room;
import Model.Villa;

public class RunMain {
    public static void main(String[] args) {
        AddNewService addNewService = new AddNewService();
        addNewService.newVilla();

      addNewService.newHouse();

      addNewService.newRoom();
     Servicess servicess = new Servicess() {
          @Override
          public String showInfo() {
              return null;
          }
      };
        Villa villa = new Villa();
        House house = new House();
        Room room = new Room();
        int sum = Servicess.count+Villa.count+House.count+Room.count;
        System.out.println("có tất cả các dịch vụ thuê la"+" "+Servicess.count+"va"+Villa.count+House.count+"va"+Room.count+"la"+sum);
    }
}
