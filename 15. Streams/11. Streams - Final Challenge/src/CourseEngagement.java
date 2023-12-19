import java.time.LocalDate;
import java.time.Period;

public class CourseEngagement {

    private final Course course;
    private final LocalDate enrollmentDate;

    private String engagementType;
    private int lastLecture;
    private LocalDate lasActivityDate;

    public CourseEngagement(Course course, LocalDate enrollmentDate, String engagementType) {
        this.course = course;
        this.enrollmentDate = this.lasActivityDate = enrollmentDate;
        this.engagementType = engagementType;
    }

    public String getCourseCode() {
        return course.courseCode();
    }

    public String getCourse() {
        return course.courseCode();
    }

    public int getEnrollmentYEar() {
        return enrollmentDate.getYear();
    }

    public String getEngagementType() {
        return engagementType;
    }

    public int getLastLecture() {
        return lastLecture;
    }

    public int getLastActivityYear() {
        return lasActivityDate.getYear();
    }

    public String getLastActivityMonth() {
        return "%tb".formatted(lasActivityDate);
    }

    public double getPercentComplete() {
        return lastLecture * 100.0 / course.lectureCount();
    }

    public int getMonthSinceActive() {

        LocalDate now = LocalDate.now();

        var months = Period.between(lasActivityDate, now).toTotalMonths();

        return (int) months;
    }

    void watchLecture(int lectureNumber, LocalDate currentDate) {

        lastLecture = Math.max(lectureNumber, lastLecture);
        lasActivityDate = currentDate;
        engagementType = "Lecture " + lastLecture;
    }

    @Override
    public String toString() {
        return "%s: %s %d %s [%d]".formatted(course.courseCode(), getLastActivityMonth(),
                getLastActivityYear(), engagementType, getMonthSinceActive());
    }
}
