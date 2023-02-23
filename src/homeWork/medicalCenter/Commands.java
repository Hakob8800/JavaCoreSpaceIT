package homeWork.medicalCenter;

public interface Commands {
    String EXIT = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID = "3";
    String CHANGE_DOCTOR_DATA_BY_ID = "4";
    String ADD_PATIENT = "5";
    String PRINT_ALL_PATIENTS_BY_DOCTOR = "6";
    String PRINT_TODAYS_PATIENTS = "7";


    static void printCommands() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + ADD_DOCTOR + " for add doctor");
        System.out.println("Please input " + SEARCH_DOCTOR_BY_PROFESSION + " for search doctor by profession");
        System.out.println("Please input " + DELETE_DOCTOR_BY_ID + " for delete doctor by ID");
        System.out.println("Please input " + CHANGE_DOCTOR_DATA_BY_ID + " for change doctor's data by ID");
        System.out.println("Please input " + ADD_PATIENT + " for add patient");
        System.out.println("Please input " + PRINT_ALL_PATIENTS_BY_DOCTOR + " for print all patients by doctor");
        System.out.println("Please input " + PRINT_TODAYS_PATIENTS + " for print today's patients");
    }

}
