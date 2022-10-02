import java.io.Serializable;
import java.util.ArrayList;

public class Teacher implements Serializable {
    private String name;
    private int years;
    private ArrayList classes;

    public Teacher( String name, int years, ArrayList classes){
        this.name = name;
        this.years = years;
        this.classes = classes;

    }

    public void setName(String teacherName){
        name = teacherName;
    }

    public String getName(){
        return name;
    }

    public void setYears(int YOE){
        years = YOE;
    }

    public int getYears(){
        return years;
    }

    public void addCourse(ans){
        System.out.println("Pick a class");
        listCourses();
        System.out.println("Choice:");
        ans = sc.nextInt();
        sc.nextLine();
        if (ans> -1 && ans < courses.size()){
            Course c = courses.get(ans).clone();
         

            teacher.addCourse(c);
            
        }

    }



}
