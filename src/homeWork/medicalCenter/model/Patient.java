package homeWork.medicalCenter.model;

import homeWork.medicalCenter.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Patient extends Person {
    private Doctor toTheDoctor;
    private Date registerTime;

    public Patient(String id, String name, String surname, String phoneNumber, Doctor toTheDoctor, Date registerTime) {
        super(id, name, surname, phoneNumber);
        this.toTheDoctor = toTheDoctor;
        this.registerTime = registerTime;
    }

    public Patient() {
    }

    public Doctor getToTheDoctor() {
        return toTheDoctor;
    }

    public void setToTheDoctor(Doctor toTheDoctor) {
        this.toTheDoctor = toTheDoctor;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(toTheDoctor, patient.toTheDoctor) && Objects.equals(registerTime, patient.registerTime) && Objects.equals(getId(), toTheDoctor.getId())
                && Objects.equals(getName(), toTheDoctor.getName()) && Objects.equals(getSurname(), toTheDoctor.getSurname())
                && Objects.equals(getPhoneNumber(), toTheDoctor.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(toTheDoctor, registerTime, getId(), getName(), getSurname(), getPhoneNumber());
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ID='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", to the doctor='Dc. " + toTheDoctor.forShow() + '\'' +
                ", registerTime='" + DateUtil.dateToString(registerTime) + '\'' +
                '}';
    }
}
