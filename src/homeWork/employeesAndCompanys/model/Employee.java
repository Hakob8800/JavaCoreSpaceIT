package homeWork.employeesAndCompanys.model;

import homeWork.employeesAndCompanys.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Employee {

    private String name;
    private String surname;
    private String employeeID;
    private double salary;
    private String position;
    private Company company;
    private boolean active = true;
    private Date registerDate;
    private Date dateOfBirth;


    public Employee(String name, String surname, String employeeID, double salary, String position, Company company,
                    Date dateOfBirth, Date registerDate) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.salary = salary;
        this.position = position;
        this.company = company;
        this.dateOfBirth = dateOfBirth;
        this.registerDate = registerDate;
    }

    public Employee() {

    }

    public boolean isActive() {
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && active == employee.active && Objects.equals(name, employee.name)
                && Objects.equals(surname, employee.surname) && Objects.equals(employeeID, employee.employeeID)
                && Objects.equals(position, employee.position) && Objects.equals(company, employee.company)
                && Objects.equals(registerDate, employee.registerDate) && Objects.equals(dateOfBirth, employee.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, employeeID, salary, position, company, active, registerDate, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +", "+
                company.toStringIdName() + '\'' +
                ", active=" + active +
                ", registerDate=" + DateUtil.dateToString(registerDate) +
                ", dateOfBirth=" + DateUtil.dateToString(dateOfBirth) +
                '}';
    }
}
