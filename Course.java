import java.io.Serializable;

public class Course implements Serializable, Cloneable{
    
    private String subject;
    private String teacher;
    private int grade;
    private boolean current;

    public Course clone() {
        try {
            return (Course) super.clone();
        } catch (Exception e) {
        }
        return null;
    }

    public Course(String subject, String teacher){
        this.subject = subject;
        this.teacher = teacher;
    }

    public Course(String subject, String teacher, int grade, boolean current){
        this.subject = subject;
        this.teacher = teacher;
        this.grade = grade;
        this.current = current;

    }

    public void setSubject(String sub){
        subject = sub;
    }

    public String getSubject(){
        return subject;
    }

    public String getTeacher(){
        return teacher;
    }

    public void setGrade(int grade){
        while (grade >= 0 && grade <= 100){
            

        }
    }

    public int getGrade(){
        return grade;
    }

    public boolean getCurrent(){
        return current == "yes";
    }

    public String toString(){
        return (("Subject:") + subject +(" Teacher:") + teacher + (" Grade:" + grade));
    }

    


    
}
