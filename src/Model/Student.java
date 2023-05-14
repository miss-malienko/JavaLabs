package Model;

import java.util.Objects;

public class Student extends Human{
    private String name;
    private Human head;
    private int recordBookNumber;
    public int recordBookNumber() {
        return recordBookNumber;
    }

    public void recordBookNumber(int recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "recordBookNumber=" + recordBookNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", sex=" + sex +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return recordBookNumber == student.recordBookNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordBookNumber);
    }

}
