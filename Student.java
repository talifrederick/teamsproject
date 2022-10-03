import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private String name;
    private int gradeLevel;
    private double GPA;
    private ArrayList <Course> courses;
    //private String favoriteTeacher;

    public Student(String name, int grade){
        this.name = name;
        gradeLevel = grade;
        courses = new ArrayList<>();

    }
   public void setName(String studentName){
         name = studentName;

    }

    public String getName(){
        return name;

    }

    public void setGradeLevel( int grade){
        gradeLevel = grade;
    }

    public int getGradeLevel(int grade){
        return grade;
    }

    public double calculateGPA(){
        int gpaPoints = 0;


        for(int index =0 ; index < courses.size(); index++){
            System.out.println(courses.get(index));

            Course  c = courses.get(index);
            int grade = c.getGrade();
            if(grade >= 90 ){
                gpaPoints += 4;
            }
                
            
    }

    

    public void removeCourse(){

    }

    public 

    public String toString(){
        return ("Name: " + name + "\nGrade Level: " + gradeLevel + "\nGPA:" + GPA);
    }



 

    
}
