package Main;

import Services.EmployeesService;
import Services.EmployeesServiceImpl;

public class CheckEmployees {
    public static void main(String[] args) {
        EmployeesService employeesService = new EmployeesServiceImpl();
        employeesService.display();
    }
}
