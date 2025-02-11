package software.engineering.main;

import java.time.LocalTime;

public class Section extends Course {
    private Professor professor;
    private Timeblock timeblock;

    protected Section(Course course, Professor professor, LocalTime startTime, LocalTime endTime) {
        super(course.getDepartment(), course.getCourseCode(), course.getCourseName());
    }

    protected Professor getProfessor() {
        return professor;
    }

    protected LocalTime[] getTimeFrame() {
        return timeblock.getTimeFrame();
    }
}
