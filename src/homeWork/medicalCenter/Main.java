package homeWork.medicalCenter;

import homeWork.medicalCenter.model.Doctor;
import homeWork.medicalCenter.model.Patient;
import homeWork.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main implements Commands {
    private static final Scanner scanner = new Scanner(System.in);
    private static Storage storage = new Storage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        Doctor doc1 = new Doctor("d1", "petya", "kurxinyan", "34040", "f@mail.ru", "duntist");
        Doctor doc2 = new Doctor("d2", "vasya", "pucin", "39090", "w@mail.ru", "ortopevt");
        Doctor doc3 = new Doctor("d3", "bob", "smith", "29080", "r@mail.ru", "xirurg");
        Patient pat1 = new Patient("p1", "yana", "dyan", "34567", doc1, new Date());
        Patient pat2 = new Patient("p2", "gana", "tyan", "34567", doc2, DateUtil.stringToDate("11-11 11/11/2000"));
        storage.add(doc1);
        storage.add(doc2);
        storage.add(doc3);
        storage.add(pat1);
        storage.add(pat2);
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorData();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printPatientsByDoctor();
                    break;
                case PRINT_TODAYS_PATIENTS:
                    storage.printTodaysPatients();
                    break;
                default:
                    System.out.println("Wrong command! Please try again.");
            }

        }

    }

    private static void deleteDoctorById() {
        storage.printDoctors();
        System.out.println("Please choose doctor, and input id for delete");
        String doctorById = scanner.nextLine();
        Doctor doctorForRegister = storage.getDoctorById(doctorById);
        if (doctorForRegister == null) {
            System.out.println("Doctor by id:" + doctorById + " does not exists. Please try again.");
            return;
        }
        storage.deleteDoctor(doctorById);
        System.out.println("Doctor deleted.");
    }

    private static void printPatientsByDoctor() {
        storage.printDoctors();
        System.out.println("Please choose doctor end input Id");
        String doctorId = scanner.nextLine();
        Doctor doctorForPrintPatients = storage.getDoctorById(doctorId);
        if (doctorForPrintPatients == null) {
            System.out.println("Doctor by id:" + doctorId + " does not exists. Please try again.");
            return;
        }
        System.out.println(storage.searchPatientsByDoctor(doctorForPrintPatients));
    }

    private static void addPatient() {
        storage.printDoctors();
        System.out.println("Please choose doctor, and input id for register");
        String doctorById = scanner.nextLine();
        Doctor doctorForRegister = storage.getDoctorById(doctorById);
        if (doctorForRegister == null) {
            System.out.println("Doctor by id:" + doctorById + " does not exists. Please try again.");
            return;
        }
        System.out.println("Please choose time for register (format: hh-mm dd/MM/yyyy)");
        try {
            String dateStr = scanner.nextLine();
            Date dateForRegister = DateUtil.stringToDate(dateStr);
            for (Patient p : storage.searchPatientsByDoctor(doctorForRegister)) {
                if (p.getRegisterTime().equals(dateForRegister)) {
                    System.out.println("The time you have chosen is already occupied please select another time or another doctor.");
                    return;
                }
            }
            System.out.println("Please input patient's id,name,surname,phoneNumber");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            String patientId = patientData[0];
            if (storage.getPatientById(patientId) != null) {
                System.out.println("Patient by id:" + patientId + " already registered. please try again and input another ID");
                return;
            }
            Patient patient = new Patient(patientData[0], patientData[1], patientData[2], patientData[3], doctorForRegister, dateForRegister);
            storage.add(patient);
            System.out.println("Patient registered!");
        } catch (ParseException e) {
            System.out.println("Please input in format 23-20 30/11/2023");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please input 4 data: id,name,surName,phoneNumber");
        }

    }

    private static void changeDoctorData() {
        storage.printDoctors();
        System.out.println("Please choose doctor for change data and input ID");
        String idForSearch = scanner.nextLine();
        Doctor doctorById = storage.getDoctorById(idForSearch);
        if (doctorById == null) {
            System.out.println("Sorry but by ID" + idForSearch + " nobody exist");
            return;
        }
        System.out.println(doctorById);
        System.out.println("Please input new data:");
        System.out.println("name,surname,phoneNumber,email,profession");
        try {
            String newDataStr = scanner.nextLine();
            String[] newData = newDataStr.split(",");
            doctorById.setName(newData[0]);
            doctorById.setSurname(newData[1]);
            doctorById.setPhoneNumber(newData[2]);
            doctorById.setEmail(newData[3]);
            doctorById.setProfession(newData[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please input 5 data: id,name,surName,phoneNumber,email,profession");
        }
        System.out.println("Doctor's data was changed.");
    }


    private static void addDoctor() {
        System.out.println("Please input doctor's ID,name,surname,phoneNumber,email,profession");
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String newId = doctorData[0];
        if (storage.getDoctorById(newId) != null) {
            System.out.println("Doctor with id:" + newId + " already exist. Please choose another Id.");
            return;
        }
        try {
            Doctor doctor = new Doctor(newId, doctorData[1], doctorData[2], doctorData[3], doctorData[4], doctorData[5]);
            storage.add(doctor);
            System.out.println("Doctor was added!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please input 6 data: id,name,surName,phoneNumber,email,profession");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("PLease input profession for search");
        storage.printDoctorByProfession(scanner.nextLine());
    }
}