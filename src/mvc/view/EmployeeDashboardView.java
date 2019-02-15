package mvc.view;

import mvc.model.Employee;

public class EmployeeDashboardView {

    // private Employee emolyee;

    public void printEmployeeInfo(Employee emolyee) {

        System.out.println("Name: " + emolyee.getFirstName() + " " + emolyee.getLastName());
        System.out.println("SSN: " + emolyee.getSsNumber());
        System.out.println("Salary: " + emolyee.getSalary());
    }
}
