package homeWork.employee;

import java.text.ParseException;
import java.util.Scanner;

public class EmployeeDemo {
    private static final Scanner scanner = new Scanner(System.in);
    private static final EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) throws ParseException {


        boolean isRun = true;
        employeeStorage.add(new Employee("Mike","Smith","q1",100,"driver","meta","12/12/2010"));
        employeeStorage.add(new Employee("Bob","Marley","q2",300,"barmen","amazon","20/11/1791"));
        employeeStorage.add(new Employee("Milana","Macron","q3",700,"dancer","google","13/11/1999"));


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
                    searchBySalary();
                    break;
                case "6":
                    changePositionByID();
                    break;
                case "7":
                    employeeStorage.printByStatus(true);
                    break;
                case "8":
                    inActivateEmployee();
                    break;
                case "9":
                    activateEmployee();
                    break;
                default:
                    System.out.println("Wrong command! Please try again.");

            }
        }
    }

    private static void inActivateEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("Please choose employee ID");
        String id = scanner.nextLine();
        Employee employee = employeeStorage.getByEmployeeID(id);
        if (employee == null || !employee.isActive()) {
            System.out.println("there is not employee by id " + id+", or that employee is inactive");
        }
        else {
            employee.setActive(false);
            System.out.println("Status changed!");
        }
    }
    private static void activateEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("Please choose employee ID");
        String id = scanner.nextLine();
        Employee employee = employeeStorage.getByEmployeeID(id);
        if (employee == null || employee.isActive()) {
            System.out.println("there is not employee by id " + id+", or that employee is active");
        }
        else {
            employee.setActive(true);
            System.out.println("Status changed!");
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

    private static void addEmployee() throws ParseException {
        System.out.println("Please enter name,surname,employeeId,salary,position,company,birthday(DD/MM/YYYY)");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String id = employeeData[2];
        Employee employee = employeeStorage.getByEmployeeID(id);
        if (employee == null) {
            Employee employee1 = new Employee(employeeData[0], employeeData[1], id, Double.parseDouble(employeeData[3]),
                    employeeData[4], employeeData[5],employeeData[6]);
            employeeStorage.add(employee1);
            System.out.println("Employee was added");
        } else System.out.println("Employee by id " + id + " is already exist");
    }

    private static void searchBySalary() {
        System.out.println("Please enter MIN salary for search");
        double min = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter MAX salary for search");
        double max = Double.parseDouble(scanner.nextLine());
        if (max < min) {
            System.out.println("min value must be less than maxValue, please try again");
            return;
        } else {
            employeeStorage.searchBySalary(min, max);
        }
    }

    private static void changePositionByID() {
        employeeStorage.printByStatus(true);
        System.out.println("Please choose employee ID");
        String id = scanner.nextLine();
        Employee employee = employeeStorage.getByEmployeeID(id);
        if (employee == null || !employee.isActive()) {
            System.out.println("there is not employee by id " + id+", or that employee is inactive");
        } else {
            System.out.println("Please input new position name");
            String newPosition = scanner.nextLine();
            employee.setPosition(newPosition);
            System.out.println("Position has changed!");
        }
    }


}
