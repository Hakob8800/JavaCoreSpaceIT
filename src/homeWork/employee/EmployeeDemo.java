package homeWork.employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;

        while (isRun){
            System.out.println("----------------------------------------");
            System.out.println("For exit press 0");
            System.out.println("For add employee press 1");
            System.out.println("For print all employees press 2");
            System.out.println("For search employee by ID press 3");
            System.out.println("For search employee by company press 4");
            System.out.println("For search employee by salary press 5");
            System.out.println("----------------------------------------");
            String command = scanner.nextLine();

            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please enter name");
                    String name = scanner.nextLine();
                    System.out.println("Please enter surName");
                    String surName = scanner.nextLine();
                    System.out.println("Please enter ID");
                    String ID = scanner.nextLine();
                    System.out.println("Please enter salary");
                    double salary = Double.parseDouble(scanner.nextLine());
                    System.out.println("please enter position");
                    String position = scanner.nextLine();
                    System.out.println("Please enter company");
                    String company = scanner.nextLine();
                    Employee employee = new Employee(name,surName,ID,salary,position,company);
                    employeeStorage.add(employee);
                    System.out.println("Employee successfully added");
                    break;
                case"2":
                    employeeStorage.print();
                    break;
                case"3":
                    System.out.println("Please enter key word for ID");
                    String keyWordID = scanner.nextLine();
                    employeeStorage.searchByEmployeeID(keyWordID);
                    break;
                case"4":
                    System.out.println("Please enter key word for company");
                    String keyWordCompany = scanner.nextLine();
                    employeeStorage.searchByCompany(keyWordCompany);
                    break;
                case"5":
                    System.out.println("Please enter MIN salary for search");
                    double min = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please enter MAX salary for search");
                    double max = Double.parseDouble(scanner.nextLine());
                    employeeStorage.searchBySalary(min,max);
                    break;
                default:
                    System.out.println("Wrong command! Please try again.");

            }

        }
    }
}
