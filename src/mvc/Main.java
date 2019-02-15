package mvc;

import mvc.controller.EmployeeController;
import mvc.model.Employee;
import mvc.view.EmployeeDashboardView;

public class Main {

    public static void main(String[] args) {

        //System.out.println("Hello World!");

        Employee employee = retrieveEmployeeFromServer();

        // Create our view to which we will write our employee info
        EmployeeDashboardView view = new EmployeeDashboardView();

        //Create our Controller
        EmployeeController controller = new EmployeeController(employee, view);

        controller.updateDachboardView();

    }

    public static Employee retrieveEmployeeFromServer() {

        Employee employee = new Employee();
        employee.setSsNumber("342567864");
        employee.setFirstName("James");
        employee.setLastName("Bond");
        employee.setSalary(125000);

        return employee;
    }
}
