package homeWork.medicalCenter;

import homeWork.medicalCenter.model.Doctor;
import homeWork.medicalCenter.model.Patient;
import homeWork.medicalCenter.model.Person;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Storage {

    private Person[] storage = new Person[10];
    int size = 0;

    public void add(Person person) {
        if (size == storage.length) {
            extend();
        } else storage[size++] = person;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Doctor) {
                System.out.println(storage[i]);
            }
        }
    }

    public void printDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Doctor && ((Doctor) storage[i]).getProfession().equals(profession)) {
                System.out.println(storage[i]);
            }
        }
    }

    public List<Patient> searchPatientsByDoctor(Doctor doctor) {
        List<Patient> patients = new ArrayList();
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Patient) {
                if (((Patient) storage[i]).getToTheDoctor().equals(doctor))
                    patients.add((Patient) storage[i]);
            }
        }
        return patients;
    }

    private void extend() {
        Person[] tmp = new Person[storage.length + 10];
        System.arraycopy(storage, 0, tmp, 0, storage.length);
        storage = tmp;
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getId().equals(id)) {
                if (storage[i] instanceof Doctor)
                    return (Doctor) storage[i];
            }
        }
        return null;
    }

    public boolean compeareDate(Date dateForRegister, Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Patient) {
                Patient patient = (Patient) storage[i];
                return patient.getToTheDoctor().getId().equals(doctor.getId()) && patient.getRegisterTime().equals(dateForRegister);
            }
        }
        return false;
    }

    public void deleteDoctor(String doctorById) {
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Doctor && storage[i].getId().equals(doctorById)) {
                for (int j = i; j < size-1; j++) {
                    storage[j] = storage[j + 1];
                }
            }
        }
        size--;
    }

    public void printTodaysPatients() {
        Date today = new Date();
        int year = today.getYear();
        int month = today.getMonth();
        int day = today.getDay();
        for (int i = 0; i < size; i++) {
            if(storage[i] instanceof Patient){
                Date patientDate =((Patient) storage[i]).getRegisterTime();
               if(patientDate.getYear()==year&&patientDate.getMonth()==month&&patientDate.getDay()==day){
                   System.out.println(storage[i]);
               }
            }
        }
    }
}
