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
                    employeeStorage.add(employeeStorage.createEmployee());

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
                case"6":
                    employeeStorage.changePositionByID();
                    break;
                case"7":
                    employeeStorage.printActiveEmployees();
                    break;
                case"8":
                    employeeStorage.inActiveEmployee();
                    break;
                case"9":
                    employeeStorage.activateEmployee();
                    break;
                default:
                    System.out.println("Wrong command! Please try again.");

            }

        }
    }
}
