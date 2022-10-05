import java.io.Serializable;

public class Course implements Serializable, Cloneable{
    
    private String subject;
    private Teacher teacher;
    private int grade;
    private boolean current;

    public Course clone() {
        try {
            return (Course) super.clone();
        } catch (Exception e) {
        }
        return null;
    }

    public Course(String subject, Teacher teacher){
        this.subject = subject;
        this.teacher = teacher;
    }

    public Course(String subject, Teacher teacher, int grade, boolean current){
        this.subject = subject;
        this.teacher = teacher;
        this.grade = grade;
        this.current = current;

    }

    

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;

    }

    public void setGrade(int grade){
        while (grade > 0 && grade <= 100){
            this.grade = grade;
            

        }
    }

    public int getGrade(){
        return grade;
    }

    public boolean getCurrent(){
        return current ;
    }
    public void setCurrent(boolean b){
        current = b;
    }

    public String toString(){
        return (subject +(" By ") + teacher + (" Grade:" + grade));
    }

    


    
}
