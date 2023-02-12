package homeWork.employee;

import java.util.Scanner;

public class EmployeeDemo {
    private static final Scanner scanner = new Scanner(System.in);
    private static final EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {


        boolean isRun = true;

        while (isRun) {
            String command = chooseCommand();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    getEmployeeById();

                    break;
                case "4":
                    System.out.println("Please input company name");
                    employeeStorage.searchByCompany(scanner.nextLine());
                    break;
                case "5":
                    System.out.println("Please input min value");
                    double min = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input max value");
                    double max = Double.parseDouble(scanner.nextLine());
                    employeeStorage.searchBySalary(min,max);
                    break;
                case "6":
                    System.out.println("Please input employee id");
                    employeeStorage.changePositionByID(scanner.nextLine());
                    break;
                case "7":
                    employeeStorage.printActiveEmployees();
                    break;
                case "8":
                    System.out.println("Please input employee id");
                    employeeStorage.inActiveEmployee(scanner.nextLine());
                    break;
                case "9":
                    System.out.println("Please input employee id");
                    employeeStorage.activateEmployee(scanner.nextLine());
                    break;
                default:
                    System.out.println("Wrong command! Please try again.");

            }
        }
    }

    private static void getEmployeeById() {
        System.out.println("Please input ID");
        String id = scanner.nextLine();
        Employee employee = employeeStorage.getByEmployeeID(id);
        if (employee == null) {
            System.out.println("Employee by Id " + id + " dos not exist");
        } else {
            System.out.println(employee);
        }
    }


    private static String chooseCommand() {
        System.out.println("----------------------------------------");
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add employee");
        System.out.println("Please input 2 for print all employees");
        System.out.println("Please input 3 for search employee by ID");
        System.out.println("Please input 4 for search employee by company");
        System.out.println("Please input 5 for search employee by salary");
        System.out.println("Please input 6 for change employee position by id");
        System.out.println("Please input 7 for print only active employees");
        System.out.println("Please input 8 for inactive employee by id");
        System.out.println("Please input 9 for activate employee by id");
        System.out.println("----------------------------------------");
        return scanner.nextLine();
    }

    private static void addEmployee() {
        System.out.println("Please enter name,surname,employeeId,salary,position,company");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String id = employeeData[2];
        Employee employee = employeeStorage.getByEmployeeID(id);
        if (employee == null) {
            Employee employee1 = new Employee(employeeData[0], employeeData[1], id, Double.parseDouble(employeeData[3]),
                    employeeData[4], employeeData[5]);
            employeeStorage.add(employee1);
            System.out.println("Employee was added");
        } else System.out.println("Employee by id " + id + " is already exist");
    }

    private static void inputForSearchBySalary() {
        System.out.println("Please enter MIN salary for search");
        double min = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter MAX salary for search");
        double max = Double.parseDouble(scanner.nextLine());
        System.out.println("There is not any employee with salary in range from " + min + " to " + max);
    }


}
