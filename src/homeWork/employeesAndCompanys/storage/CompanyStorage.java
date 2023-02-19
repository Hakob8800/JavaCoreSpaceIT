package homeWork.employeesAndCompanys.storage;

import homeWork.employeesAndCompanys.model.Company;

public class CompanyStorage {

    private Company[] array = new Company[10];
    private int size;


    public void add(Company company) {
        if (size == array.length) {
            extend();
        }
        if (company != null) {
            array[size++] = company;
        }
    }
    private void extend() {
        Company[] tmp = new Company[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, array.length);
        array = tmp;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }
    public Company getByCompanyID(String id) {
        for (int i = 0; i < size; i++) {
            if (array[i].getId().equals(id)) {
                return array[i];
            }
        }
        return null;
    }
    public int getCompaniesCount(){
        return size;
    }

}
