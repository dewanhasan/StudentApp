package ie.atu.week5;

public class StudentClass {
    private String name;
    private String email;
    private String course;

    public StudentClass() {
        this.name = "";
        this.email = "";
        this.course = "";

    }

    public StudentClass(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public StudentClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
