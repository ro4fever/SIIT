package exceptions.studentcatalogue;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentHandler {

    TimeUtil dateConvertor = new TimeUtil();

    MessagePrinter printer = new MessagePrinter();

    private List<Student> studentList = new ArrayList<>();

    private List<Student> retrievedByAgeList = new ArrayList<>();

    public String addStudent(Student student) {
        if (student.getFirstName().equals("")) {
            throw new IllegalArgumentException("Please check the input First Name. It can't be empty.");
        }
        if (student.getLastName().equals("")) {
            throw new IllegalArgumentException("Please check the input Last Name. It can't be empty.");
        }
        if (student.getID() == null || student.getID().equals("")) {
            throw new IllegalArgumentException("Please check the input ID. It can't be empty nor null.");
        }
        if (dateConvertor.checkDate(student.getBirthDate())) studentList.add(student);
        return student.getLastName();
    }

    public Student deleteStudent(String ID) {
        Student student = null;
        String temp = "";

        if (ID == null || ID.length() != 13) {
            throw new IllegalArgumentException("Student does not exist. Please verify the input ID.");
        }

        for(Student s : studentList) {
            if (s.getID().equals(ID)) {
                temp = s.getID();
                student = s;
                studentList.remove(s);
            }
        }
        if (temp.equals(""))  printer.printNoSuchStudent();
        return student;
    }

    public List<Student> retrieveAllStudentsByAge(String age) {
        Integer intAge = 0;
        try {
            intAge = Integer.parseInt(age);
        } catch (NumberFormatException nfe) {
            printer.printRetrieveByAgeException();
        }

        for(Student s : studentList) {
            if (intAge == dateConvertor.calculateAge(s.getBirthDate())) {
                retrievedByAgeList.add(s);
            }
        }
        return retrievedByAgeList;
    }

    public List<Student> sortByLastName() {
        if (studentList.isEmpty()) throw new IllegalArgumentException("The input is empty. Please add new students to the list.");
        studentList.sort(Comparator.comparing(Student::getLastName));
        return studentList;
    }

    public List<Student> sortByBirthDate() {
        if (studentList.isEmpty()) throw new IllegalArgumentException("The input is empty. Please add new students to the list.");
        studentList.sort(Comparator.comparing(Student::getParsedBirthDate));
        return studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Student> getRetrievedByAgeList() {
        return retrievedByAgeList;
    }


}
