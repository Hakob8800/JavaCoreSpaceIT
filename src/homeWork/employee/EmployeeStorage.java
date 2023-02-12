package homeWork.employee;

import java.util.Scanner;

public class EmployeeStorage {

    Scanner scanner = new Scanner(System.in);
    private Employee[] array = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (size == array.length) {
            extend();
        }
        if (employee != null) {
            array[size++] = employee;
        }
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }

    private void extend() {
        Employee[] tmp = new Employee[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public Employee getByEmployeeID(String id) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeID().equals(id)) {
                return array[i];
            }
        }
        return null;
    }
    public void searchByCompany(String company) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().equalsIgnoreCase(company.toLowerCase())) {
                System.out.println(array[i]);
            }
        }
    }
    public void searchBySalary(double min, double max) {
        for (int i = 0; i < size; i++) {
            double empSalary = array[i].getSalary();
            if (empSalary >= min && empSalary <= max) {
                System.out.println(array[i]);
            }
        }
    }


    public void changePositionByID(String id) {
        Employee employee = getByEmployeeID(id);
        System.out.println("Enter new position");
        String newPosition = scanner.nextLine();
        employee.setPosition(newPosition);
    }

    public void printActiveEmployees() {
        for (int i = 0; i < size; i++) {
            if (array[i].getActive()) {
                System.out.println(array[i]);
            }
        }
    }

    public void inActiveEmployee(String id) {
        Employee employee = getByEmployeeID(id);
        if (employee != null) {
            employee.setActive(false);
            System.out.println("Employee inactivated");
        }
    }

    public void activateEmployee(String id) {
        Employee employee = getByEmployeeID(id);
        if (employee != null) {
            employee.setActive(true);
            System.out.println("Employee activated");
        }
    }
}
