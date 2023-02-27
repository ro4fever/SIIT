package exceptions.studentcatalogue;


import java.time.LocalDate;

public class Student {

    TimeUtil util = new TimeUtil();

    private final String firstName;

    private final String lastName;

    private final String birthDate;

    private final char gender;

    private final String ID;

    public Student(String firstName, String lastName, String birthDate, char gender, String ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", gender=" + gender +
                ", ID='" + ID + '\'' +
                '}';
    }

    public LocalDate getParsedBirthDate() {
        return util.retrieveDate(birthDate);
    }

    public String getID() {
        return ID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

}
