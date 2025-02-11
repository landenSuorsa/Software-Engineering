package software.engineering.main;

import java.util.ArrayList;

public class Course {
    protected ArrayList<Section> sections;
    protected ArrayList<Course> prereq;
    protected Department department;
    protected String courseName;
    protected int courseCode;

    protected Course(Department department, int courseCode, String courseName) {
    }

    protected void setSections(ArrayList<Section> sections) {
    }

    protected void setPrereqs(ArrayList<Course> prereqs) {
    }

    protected Department getDepartment() {
        return null;
    }

    protected int getCourseCode() {
        return -1;
    }

    protected String getCourseName() {
        return null;
    }
}
