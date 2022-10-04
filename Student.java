import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private String name;
    private int gradeLevel;
    private double GPA;
    private ArrayList <Course> courses;
    //private String favoriteTeacher;

    public static void main(Course[] args) {
        ArrayList<Course> courses = new ArrayList<Course>(); //Empty ArrayList of Strings created


    }


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
          return (double) gpaPoints;  
    }

    

    public void removeCourse(){
        int index = 0;
        System.out.println(courses);
        System.out.println("Enter index of the course: ");
        while( index < courses.size() ){
            Course item = courses.get(index);
            if(item.() == courses.get(index) ){ //condition goes here
                courses.remove(index); //remove item at that index
            }else{ 
                index++; //if condition not met, move on to the next element
            }
        }
      
    }
    

    

    public 

    public String toString(){
        return ("Name: " + name + "\nGrade Level: " + gradeLevel + "\nGPA:" + GPA);
    }



 

    
}
