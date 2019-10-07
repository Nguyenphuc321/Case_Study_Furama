package Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Tash12File {
    public static void main(String[] args) {
        NewCustomer newCustomer = new NewCustomer("nguyen van A", 20);
        NewCustomer newCustomer1 = new NewCustomer("nguyen van B", 19);
        NewCustomer newCustomer2 = new NewCustomer("nguyen van C", 22);
        NewCustomer newCustomer3 = new NewCustomer("nguyen van D", 24);
        List<NewCustomer> arrayliscustomer = new ArrayList<>();
        arrayliscustomer.add(newCustomer);
        arrayliscustomer.add(newCustomer1);
        arrayliscustomer.add(newCustomer2);
        arrayliscustomer.add(newCustomer3);
        writeFileContainsCustomer(arrayliscustomer);
    }

    public static void writeFileContainsCustomer(List<NewCustomer> arraylistcustomer) {
        File fileObject = new File("E:/Case_Study_Furama/abc.txt");
        try {
            FileWriter fileWriter = new FileWriter(fileObject);
            for (NewCustomer element : arraylistcustomer) {
                System.out.println(element);
                fileWriter.write(element.getNameCustomer().toString() + "\r\n");
            }
            System.out.println("save success");
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("lỗi không thực hiện được kết nối");
            e.printStackTrace();
        }
    }

    public static void readFileContainsCustomer() {
        File file = new File("E:/Case_Study_Furama");
        try {
            System.out.println("Read File");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
