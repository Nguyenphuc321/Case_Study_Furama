package Services;

import Model.Employees;

import java.util.HashMap;
import java.util.Map;

public class EmployeesServiceImpl implements EmployeesService {
    static Map<Integer,Employees>employeesMap = new HashMap<>();
    static{
        employeesMap.put(001,new Employees("nguyen thi thanh",22,"thang binh"));
        employeesMap.put(002,new Employees("nguyen van long",21,"hai long"));
        employeesMap.put(003,new Employees("nguyen thi anh",23,"da nang"));
        employeesMap.put(004,new Employees("nguyen van tu",22,"thien an"));
        employeesMap.put(005,new Employees("nguyen thien anh",24,"hang anh"));
        employeesMap.put(006,new Employees("nguyen thanh nam",34,"quang ngai"));
        employeesMap.put(007,new Employees("nguyen thi ngoc",32,"tu anh"));
        employeesMap.put(011,new Employees("nguyen thi nhi",23,"da lat"));
        employeesMap.put(012, new Employees("nguyen anh tuyet",34,"ha noi"));
        employeesMap.put(010,new Employees("nguyen van A",34,"hai phong"));
    }
    @Override
    public void display() {
        for (Integer id : employeesMap.keySet()){
            Employees employee = employeesMap.get(id);
            System.out.println(employee);
        }
    }
}
