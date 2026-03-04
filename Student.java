public class Student {
    private String name;
    private int grade;
    private boolean present;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.present = true; // default all present
    }

public Student(String name, int grade, boolean attendance) {
        this.name = name;
        this.grade = grade;
        this.present = attendance;
    }

    public String getName() { 
        return name; 
    }

    public int getGrade() { 
        return grade; 
    }

    public boolean isPresent() { 
        return present; 
    }

    public void toggleAttendance() { 
        present = !present; 
    }

    public void setGrade(int grade) { 
        this.grade = grade;
    }


    public String toString() {
        String status;
        if (present) {
            status = "P"; // present
        } else {
            status = "A"; // absent
        }
        return name + "(" + grade + ") " + status;
    }
}