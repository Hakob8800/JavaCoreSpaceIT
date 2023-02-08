package homeWork.employee;

public class EmployeeStorage {

    private Employee[] array = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (size == array.length) {
            extend();
        }
        array[size++] = employee;
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

    public void searchByEmployeeID(String keyWordID) {
        boolean found = false;
        for (int i = 0; i < size; i++) {

            Employee employee = array[i];
            if (employee.getEmployeeID().toLowerCase().contains(keyWordID.toLowerCase())) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("By keyword \"" + keyWordID + "\" nothing founds");
        }
    }

    public void searchByCompany(String keyWordCompany) {
        boolean found = false;
        for (int i = 0; i < size; i++) {

            Employee employee = array[i];
            if (employee.getCompany().toLowerCase().contains(keyWordCompany.toLowerCase())) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("By keyword \"" + keyWordCompany + "\" nothing founds");
        }
    }

    public void searchBySalary(double min, double max) {
        boolean found = false;
        for (int i = 0; i < size; i++) {

            Employee employee = array[i];
            if (employee.getSalary() >= min && employee.getSalary() <= max) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("There is not any employee whit salary in range from " + min + " to " + max);
        }
    }
}
