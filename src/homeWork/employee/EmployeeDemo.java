package homeWork.employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;

        while (isRun) {
            String command = employeeStorage.chooseCommand();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    Employee employee = employeeStorage.createEmployee();
                    employeeStorage.add(employee);
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println(employeeStorage.searchByEmployeeID());
                    break;
                case "4":
                    for (Employee employee1 : employeeStorage.searchByCompany()) {
                        if (employee1 != null) {
                            System.out.println(employee1);
                        }
                    }
                    break;
                case "5":
                    for (Employee employee1 : employeeStorage.searchBySalary()) {
                        if (employee1 != null) {
                            System.out.println(employee1);
                        }
                    }
                    break;
                default:
                    System.out.println("Wrong command! Please try again.");

            }

        }
    }
}
