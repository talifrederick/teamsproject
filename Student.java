import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private String name;
    private int gradeLevel;
    private double GPA;
    private ArrayList courses;
    //private String favoriteTeacher;

    public Student(String name, int grade, ArrayList courses){
        this.name = name;
        gradeLevel = grade;
        this.courses = courses;

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
        return (double)(s1.getGrade()) 
    }

    public void addCourse(ans){
        System.out.println("Pick a class");
        listCourses();
        System.out.println("Choice:");
        ans = sc.nextInt();
        sc.nextLine();
        if (ans> -1 && ans < courses.size()){
            Course c = courses.get(ans).clone();
            System.out.println("Enter grade for the course:");
            int grade = sc.nextInt();
            c.setGrade(grade);
            sc.nextLine();
            System.out.println("Currently taking it (y/n)?");
            String yesNo = sc.nextLine();
            if (yesNo.equals("y")){
                c.setCurrent(current:true);
            }

            student.addCourse(c);
            
        }

    }

    public void removeCourse(){

    }

    public String toString(){
        return ("Name: " + name + "\nGrade Level: " + gradeLevel + "\nGPA:" + GPA);
    }



 

    
}
