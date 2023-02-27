package homeWork.medicalCenter;

import homeWork.medicalCenter.model.Doctor;
import homeWork.medicalCenter.model.Patient;
import homeWork.medicalCenter.model.Person;
import homeWork.medicalCenter.util.DateUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Storage {

    private Person[] storage = new Person[10];
    int size = 0;

    public void add(Person person) {
        if (size == storage.length) {
            extend();
        }
        if (person != null) {
            storage[size++] = person;
        }
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Doctor) {
                System.out.println(storage[i]);
            }
        }
    }

    public Patient[] searchPatientsByDoctor(Doctor doctor) {
        int searchSize = 0;
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Patient) {
                if (((Patient) storage[i]).getToTheDoctor().equals(doctor))
                    searchSize++;
            }
        }
        Patient[] patients = new Patient[searchSize];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Patient) {
                if (((Patient) storage[i]).getToTheDoctor().equals(doctor)) {
                    patients[j] = (Patient) storage[i];
                    j++;
                }
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

    public void deleteDoctor(String doctorById) {
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Doctor && storage[i].getId().equals(doctorById)) {
                for (int j = i; j < size - 1; j++) {
                    storage[j] = storage[j + 1];
                }
                size--;
            }
            if (storage[i] instanceof Patient && ((Patient) storage[i]).getToTheDoctor().getId().equals(doctorById)) {
                for (int j = i; j < size - 1; j++) {
                    storage[j] = storage[j + 1];
                }
                size--;
                break;
            }
        }
    }

    public List<Patient> getTodayPatients() {
        List<Patient> patients = new ArrayList<>();
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Patient) {
                Date patientDate = ((Patient) storage[i]).getRegisterTime();
                if (DateUtil.isSameDay(today, patientDate)) {
                    patients.add((Patient) storage[i]);
                }
            }
        }
        return patients;
    }

    public Patient getPatientById(String patientId) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getId().equals(patientId)) {
                if (storage[i] instanceof Patient)
                    return (Patient) storage[i];
            }
        }
        return null;
    }

    public Doctor[] getDoctorByProfession(Profession profession) {
        int searchSize = 0;
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Doctor) {
                if (((Doctor) storage[i]).getProfession() == profession)
                    searchSize++;
            }
        }
        Doctor[] doctors = new Doctor[searchSize];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (storage[i] instanceof Doctor) {
                if (((Doctor) storage[i]).getProfession() == profession) {
                    doctors[j] = (Doctor) storage[i];
                    j++;
                }
            }
        }
        return doctors;
    }
}
