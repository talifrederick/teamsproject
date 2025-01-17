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

   // public void setCalculateGPA(double gpa){
      //  calculateGPA = gpa;

    //}

    public Object calculateGPA(){
        double gpaPoints = 0;
        if(courses.size()==0){
            return null;
        }


        for(int index =0 ; index < courses.size(); index++){
            System.out.println(courses.get(index));

            Course  c = courses.get(index);
            int grade = c.getGrade();
            if(grade >= 90 ){
                gpaPoints += 4;
            }
            if(90> grade && grade >= 80){
                gpaPoints += 3;
            }
            if(80> grade && grade >=70){
                gpaPoints += 2;
            }
            if(70 > grade && grade >= 60){
                gpaPoints += 1;
            }

            
        }      
          return (double) gpaPoints/ courses.size();  
    }
    public ArrayList<Course> getCourses(){
        return courses;
    }
    public Course getBestClass(){
        if(courses.size()==0){
            return null;
        }

        Course best = courses.get(0);
        for(int index =0 ; index < courses.size(); index++){
            Course c = courses.get(index);
            if(c.getGrade()> best.getGrade()){
                best=c;
            

             }
             


        }
        return best;
    }



    

    public void removeCourse(Course c){
        courses.remove(c);

      
    }

    public void addCourse(Course c){
        courses.add(c);
    }
    

    

    

    public String toString(){
        if(getBestClass()== null){
            return "Name: " + name + " Grade Level: " + gradeLevel + " GPA:" + calculateGPA();

        }

        else{
            return "Name: " + name+ " Grade Level:" + gradeLevel + " GPA: " + calculateGPA() + " Best Class: " + getBestClass();
        }
        
    }

}



 

    

