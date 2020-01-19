package exercises.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // getters and setters
    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public Teacher getInstructor() {
        return instructor;
    }
    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }
    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @Override
    public String toString() {
        return "Course{" +
                "topic='" + topic + '\'' +
                ", instructor=" + instructor +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;  // instanceOf instead of getClass ???
        Course course = (Course) o;
        return Objects.equals(getTopic(), course.getTopic()) &&
                Objects.equals(getInstructor(), course.getInstructor()) &&
                Objects.equals(getEnrolledStudents(), course.getEnrolledStudents());
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getTopic(), getInstructor(), getEnrolledStudents());
//    }
}
