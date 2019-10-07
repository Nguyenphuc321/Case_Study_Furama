package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String number;
        ArrayList<String>stringArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Nhập dich can thue la: " + i + ": ");
            number = scanner.nextLine();
            stringArrayList.add(number);
        }

        // tạo 1 ArrayList arrTemp
        ArrayList<String> arrTemp = new ArrayList<>();

        // thêm các phần tử của arrListNumber vào arrTemp
        // nếu trong arrTemp đã tồn tại phần tử giống trong arrListNumber
        // thì không thêm vào, ngược lại thêm bình thường
        for (int i = 0; i < stringArrayList.size(); i++) {
            if (!arrTemp.contains(stringArrayList.get(i))) {
                arrTemp.add(stringArrayList.get(i));
            }
        }
        // xóa các phần tử của stringArrayList
        stringArrayList.clear();

        // thêm tất cả các phần tử của arrTemp vào stringArrayList
        // lúc này ta sẽ có 1 ArrayList stringArrayList
        // không chứa các phần tử trùng nhau
        stringArrayList.addAll(arrTemp);
        System.out.println("Các dich vu can thue la: ");
        System.out.println(stringArrayList);
    }
}
