package homeWork.employeesAndCompanys.storage;

import homeWork.employeesAndCompanys.model.Employee;

public class EmployeeStorage {
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
    public void printByStatus(boolean isActive) {
        for (int i = 0; i < size; i++) {
            if (array[i].isActive() == isActive) {
                System.out.println(array[i] + " ");
            }

        }
    }
    private void extend() {
        Employee[] tmp = new Employee[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, array.length);
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
    public void searchBySalary(double min, double max) {
        for (int i = 0; i < size; i++) {
            double empSalary = array[i].getSalary();
            if (empSalary >= min && empSalary <= max) {
                System.out.println(array[i]);
            }
        }
    }

    public void printEmployeesByCompanyId(String companyId) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            //todo if(--)then sout"By id"+id+"not any companies"
            if(employee.getCompany().getId().equals(companyId)){
                System.out.println(employee);
            }
        }
    }
}
