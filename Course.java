import java.io.Serializable;

public class Course implements Serializable{
    
    private String subject;
    private String teacher;
    private int grade;
    private boolean current;

    public Course(String subject, String teacher ){
        this.subject = subject;
        this.teacher = teacher;
    }

    public Course(String subject){
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    public String getTeacher(){
        return teacher;
    }


    
}
