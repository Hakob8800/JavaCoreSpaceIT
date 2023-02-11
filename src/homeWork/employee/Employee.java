package homeWork.employee;

import java.util.Objects;

public class Employee {

    private String name;
    private String surname;
    private String employeeID;
    private double salary;
    private String position;
    private String company;
    private boolean active = true;

    public Employee(String name, String surname, String employeeID, double salary, String position, String company) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.salary = salary;
        this.position = position;
        this.company = company;
    }

    public Employee() {

    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && active == employee.active && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(employeeID, employee.employeeID) && Objects.equals(position, employee.position) && Objects.equals(company, employee.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, employeeID, salary, position, company, active);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", company='" + company + '\'' +
                ", active=" + active +
                '}';
    }
}
