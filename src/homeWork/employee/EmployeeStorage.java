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
            System.out.println("Employee successfully added");
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

    public Employee searchByEmployeeID() {
        System.out.println("Please enter key word for ID");
        String ID = scanner.nextLine();
        for (Employee employee : array) {
            if (employee != null) {
                if (employee.getEmployeeID().equals(ID)) {
                    return employee;
                }
            }
        }
        System.out.println("By ID \'" + ID + "\' nothing founds");
        return null;
    }

    public Employee[] searchByCompany() {
        boolean found = false;
        Employee[] arrayForReturn = new Employee[size];
        int j = 0;
        System.out.println("Please enter key word for company");
        String keyWordCompany = scanner.nextLine();
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().toLowerCase().contains(keyWordCompany.toLowerCase())) {
                found = true;
                arrayForReturn[j++] = employee;
            }
        }
        if (!found) {
            System.out.println("By keyword \"" + keyWordCompany + "\" nothing founds");
        }
        return arrayForReturn;
    }

    public Employee[] searchBySalary() {
        Employee[] arrayForSearch = new Employee[size];
        int j = 0;
        boolean found = false;
        System.out.println("Please enter MIN salary for search");
        double min = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter MAX salary for search");
        double max = Double.parseDouble(scanner.nextLine());
        for (int i = 0; i < size; i++) {

            Employee employee = array[i];
            if (employee.getSalary() >= min && employee.getSalary() <= max) {
                found = true;
                arrayForSearch[j++] = employee;
            }
        }
        if (!found) {
            System.out.println("There is not any employee with salary in range from " + min + " to " + max);
        }
        return arrayForSearch;
    }

    public String chooseCommand() {
        System.out.println("----------------------------------------");
        System.out.println("For exit press 0");
        System.out.println("For add employee press 1");
        System.out.println("For print all employees press 2");
        System.out.println("For search employee by ID press 3");
        System.out.println("For search employee by company press 4");
        System.out.println("For search employee by salary press 5");
        System.out.println("----------------------------------------");
        return scanner.nextLine();
    }

    public Employee createEmployee() {
        System.out.println("Please enter name");
        String name = scanner.nextLine();
        System.out.println("Please enter surName");
        String surname = scanner.nextLine();
        System.out.println("Please enter ID");
        String ID = scanner.nextLine();
        for (Employee employee : array) {
            if (employee != null) {
                if (employee.getEmployeeID().equals(ID)) {
                    System.out.println("ID " + ID + " has already used");
                    return null;
                }
            }
        }
        System.out.println("Please enter salary");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("please enter position");
        String position = scanner.nextLine();
        System.out.println("Please enter company");
        String company = scanner.nextLine();

        return new Employee(name, surname, ID, salary, position, company);
    }
}
