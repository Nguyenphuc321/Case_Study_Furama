package Services;

import java.util.ArrayList;
import java.util.List;

public class AddNewServiceImpl implements AddNewService {
    List<Object>list=new ArrayList<>();
    @Override
    public void add(Object o){
        list.add(o);
        System.out.println("bạn đã thêm thành công ");

    }
}
