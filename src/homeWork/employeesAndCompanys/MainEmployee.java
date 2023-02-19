package homeWork.employeesAndCompanys;

import homeWork.employeesAndCompanys.model.Company;
import homeWork.employeesAndCompanys.model.Employee;
import homeWork.employeesAndCompanys.storage.CompanyStorage;
import homeWork.employeesAndCompanys.storage.EmployeeStorage;
import homeWork.employeesAndCompanys.util.Commands;
import homeWork.employeesAndCompanys.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MainEmployee implements Commands {
    private static final Scanner scanner = new Scanner(System.in);
    private static final EmployeeStorage employeeStorage = new EmployeeStorage();
    private static final CompanyStorage companyStorage = new CompanyStorage();

    public static void main(String[] args) throws ParseException {


        boolean isRun = true;
        Company com = new Company("2","2","2","2");
        companyStorage.add(new Company("1","1","1","1"));
        companyStorage.add(com);
        employeeStorage.add(new Employee("Mike", "Smith", "q1", 100, "driver", com, DateUtil.stringToDate("12.12.1212"), new Date()));
        employeeStorage.add(new Employee("Bob", "Marley", "q2", 300, "barmen", com, DateUtil.stringToDate("20.11.1791"), new Date()));
        employeeStorage.add(new Employee("Milana", "Macron", "q3", 700, "dancer", com, DateUtil.stringToDate("13.11.1999"), new Date()));


        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case PRINT_ALL_COMPANIES:
                    companyStorage.print();
                    break;
                case GET_EMPLOYEE_BY_EMPLOYEE_ID:
                    getEmployeeById();
                    break;
                case PRINT_EMPLOYEES_IN_COMPANY_BY_COMPANY_ID:
                    printEmployeesInCompanyByCompanyId();
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    searchBySalary();
                    break;
                case CHANGE_EMPLOYEE_POSITION_BY_EMPLOYEE_ID:
                    changePositionByID();
                    break;
                case PRINT_ACTIVE_EMPLOYEES:
                    employeeStorage.printByStatus(true);
                    break;
                case INACTIVATE_EMPLOYEE_BY_EMPLOYEE_ID:
                    inActivateEmployee();
                    break;
                case ACTIVATE_EMPLOYEE_BY_EMPLOYEE_ID:
                    activateEmployee();
                    break;
                default:
                    System.out.println("Wrong command! Please try again.");

            }
        }
    }

    private static void printEmployeesInCompanyByCompanyId() {
        if (companyStorage.getCompaniesCount() < 1){
            System.out.println("Not any company.At first create company please.");
            return;
        }
            companyStorage.print();
        System.out.println("Please choose company, and input company ID");
        String companyId = scanner.nextLine();
        employeeStorage.printEmployeesByCompanyId(companyId);
    }

    private static void addCompany() {
        System.out.println("Please input ID,name,address,phone number");
        String companyDataStr = scanner.nextLine();
        String[] companyData = companyDataStr.split(",");
        String id = companyData[0];
        if (companyStorage.getByCompanyID(id) == null) {
            Company company = new Company(id, companyData[1], companyData[2], companyData[3]);
            companyStorage.add(company);
            System.out.println("Company was added");
        } else {
            System.out.println("Company by id:" + id + " is already exists. Please try again");
        }


    }

    private static void inActivateEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("Please choose employee ID");
        String id = scanner.nextLine();
        Employee employee = employeeStorage.getByEmployeeID(id);
        if (employee == null) {
            System.out.println("there is not employee by id " + id);
        } else if (!employee.isActive()) {
            System.out.println("Employee with id '" + id + "' is inactive");
        } else {
            employee.setActive(false);
            System.out.println("Status changed!");
        }
    }

    private static void activateEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("Please choose employee ID");
        String id = scanner.nextLine();
        Employee employee = employeeStorage.getByEmployeeID(id);
        if (employee == null) {
            System.out.println("there is not employee by id " + id);
        } else if (employee.isActive()) {
            System.out.println("Employee with id '" + id + "' is active");
        } else {
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

    private static void addEmployee() throws ParseException {
        companyStorage.print();
        if (companyStorage.getCompaniesCount() == -1) {
            System.out.println("There are no companies to add an employee to. \nAt first please create company");
            return;
        }
        System.out.println("Please choose company and input company ID");
        String companyId = scanner.nextLine();
        Company companyByID = companyStorage.getByCompanyID(companyId);
        if (companyByID == null) {
            System.out.println("Company by Id:" + companyId + " does not exists. Please try again");
            return;
        } else {
            System.out.println("Please enter name,surname,employeeId,salary,position,birthday(DD.MM.YYYY)");
            String employeeDataStr = scanner.nextLine();
            String[] employeeData = employeeDataStr.split(",");
            String id = employeeData[2];
            Employee employee = employeeStorage.getByEmployeeID(id);
            if (employee == null) {
                Employee employee1 = new Employee(employeeData[0], employeeData[1], id, Double.parseDouble(employeeData[3]),
                        employeeData[4], companyByID, DateUtil.stringToDate(employeeData[5]), new Date());
                employeeStorage.add(employee1);
                System.out.println("Employee was added");
                companyByID.setEmployeeCount(companyByID.getEmployeeCount() + 1);
            } else System.out.println("Employee by id " + id + " is already exist");
        }

    }

    private static void searchBySalary() {
        System.out.println("Please enter MIN salary for search");
        double min = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter MAX salary for search");
        double max = Double.parseDouble(scanner.nextLine());
        if (max < min) {
            System.out.println("min value must be less than maxValue, please try again");
            return;
        }
        employeeStorage.searchBySalary(min, max);

    }

    private static void changePositionByID() {
        employeeStorage.printByStatus(true);
        System.out.println("Please choose employee ID");
        String id = scanner.nextLine();
        Employee employee = employeeStorage.getByEmployeeID(id);
        if (employee == null) {
            System.out.println("there is not employee by id " + id);
        } else if (!employee.isActive()) {
            System.out.println("Employee with id '" + id + "' is inactive");
        } else {
            System.out.println("Please input new position name");
            String newPosition = scanner.nextLine();
            employee.setPosition(newPosition);
            System.out.println("Position has changed!");
        }
    }

}
