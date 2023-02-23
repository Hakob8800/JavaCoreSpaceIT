package homeWork.medicalCenter.model;

import java.util.Objects;

public class Doctor extends Person {

    private String email;
    private String profession;

    public Doctor(String id, String name, String surname, String phoneNumber, String email, String profession) {
        super(id, name, surname, phoneNumber);
        this.email = email;
        this.profession = profession;
    }

    public Doctor() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(email, doctor.email) && Objects.equals(profession, doctor.profession) && Objects.equals(getId(), doctor.getId())
                && Objects.equals(getName(), doctor.getName()) && Objects.equals(getSurname(), doctor.getSurname())
                && Objects.equals(getPhoneNumber(), doctor.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, profession, getId(), getName(), getSurname(), getPhoneNumber());
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "ID='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }

    public String forShow() {
        return this.getName() + ", id:" + this.getId();
    }
}
