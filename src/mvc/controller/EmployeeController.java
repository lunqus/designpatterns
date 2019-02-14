package mvc.controller;

import mvc.model.Employee;
import mvc.view.EmployeeDashboardView;

public class EmployeeController {

    private Employee employeeModel;
    private EmployeeDashboardView view;

    public EmployeeController (Employee employeeModel, EmployeeDashboardView view) {
        this.employeeModel = employeeModel;
        this.view = view;
    }

    public void setEmployee(String name, String lastName) {
        employeeModel.setFirstName(name);
        employeeModel.getLastName(lastName);
    }

    public String getEmployeeName() {
        return employeeModel.getFirstName() + " " + employeeModel.getLastName();
    }
}
