package homeWork.employeesAndCompanys.util;

public interface Commands {
    String EXIT = "0";
    String ADD_COMPANY = "1";
    String ADD_EMPLOYEE = "2";
    String PRINT_ALL_EMPLOYEES = "3";
    String PRINT_ALL_COMPANIES = "4";
    String GET_EMPLOYEE_BY_EMPLOYEE_ID = "5";
    String PRINT_EMPLOYEES_IN_COMPANY_BY_COMPANY_ID = "6";
    String SEARCH_EMPLOYEE_BY_SALARY_RANGE = "7";
    String CHANGE_EMPLOYEE_POSITION_BY_EMPLOYEE_ID = "8";
    String PRINT_ACTIVE_EMPLOYEES = "9";
    String INACTIVATE_EMPLOYEE_BY_EMPLOYEE_ID = "10";
    String ACTIVATE_EMPLOYEE_BY_EMPLOYEE_ID = "11";

    static void printCommands(){
        System.out.println("----------------------------------------");
        System.out.println("Please input "+EXIT+" for exit");
        System.out.println("Please input "+ADD_COMPANY+" for add company");
        System.out.println("Please input "+ADD_EMPLOYEE+" for add employee");
        System.out.println("Please input "+PRINT_ALL_EMPLOYEES+" for print all employees");
        System.out.println("Please input "+PRINT_ALL_COMPANIES+" for print all companies");
        System.out.println("Please input "+GET_EMPLOYEE_BY_EMPLOYEE_ID+" for get employee by ID");
        System.out.println("Please input "+PRINT_EMPLOYEES_IN_COMPANY_BY_COMPANY_ID+" for print employees in company");
        System.out.println("Please input "+SEARCH_EMPLOYEE_BY_SALARY_RANGE+" for search employee by salary range");
        System.out.println("Please input "+CHANGE_EMPLOYEE_POSITION_BY_EMPLOYEE_ID+" for change employee position by id");
        System.out.println("Please input "+PRINT_ACTIVE_EMPLOYEES+" for print only active employees");
        System.out.println("Please input "+INACTIVATE_EMPLOYEE_BY_EMPLOYEE_ID+" for inactivate employee by id");
        System.out.println("Please input "+ACTIVATE_EMPLOYEE_BY_EMPLOYEE_ID+" for activate employee by id");
        System.out.println("----------------------------------------");
    }

}


