import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TEAMS{
    static ArrayList<Student> students;
    static ArrayList<Teacher> teachers;
    static ArrayList<Course> courses;

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        
        //Load the data if available ### DO NOT CHANGE THIS PART
        try{
            students =(ArrayList<Student>)loadData("students");

        }catch(Exception e){
            students = new ArrayList<>();
        }
        try{
            teachers =(ArrayList<Teacher>)loadData("teachers");
        }catch(Exception e){
            teachers = new ArrayList<>();
        }
        try{
            courses =(ArrayList<Course>)loadData("courses");
        }catch(Exception e){
            courses = new ArrayList<>();
        }


        //############## MAIN MENU STARTS HERE ##############
        int ans = 0;

        while(ans != -1){
            System.out.println("options:");
            System.out.println("1: Add student");
            System.out.println("2: Add Teacher");
            System.out.println("3. Add Course");
            System.out.println("4: Edit Student");
            System.out.println("5: List Students" );
            System.out.println("6: List Courses");
            System.out.println("7: Search for sostudent");
            System.out.println("8: Exit");
            System.out.println();
            System.out.println("Choice: ");
            ans = sc.nextInt();
            sc.nextLine();

        
            if(ans== 1){
                addStudent();
                
            }
            if(ans==2){
                addTeacher();
                
            }

            if(ans==3){
                addCourse();
                

            }

            if(ans==4){
                
        

            }

            if(ans == 5){
                

            }

            if(ans==6){
                

            }

            if(ans ==7){
                
            }

            if(ans==8){
                
            }

        }
        

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

    public static void addStudent(){

    }

    //#### DO NOT CHANGE THIS FUNCTION ####
    public static void saveData()throws Exception{
        FileOutputStream f1 = new FileOutputStream("students");
        ObjectOutputStream os = new ObjectOutputStream(f1);
        os.writeObject(students);
        os.close();
        f1.close();

        FileOutputStream f2 = new FileOutputStream("courses");
        os = new ObjectOutputStream(f2);
        os.writeObject(courses);
        os.close();
        f2.close();

        FileOutputStream f3 = new FileOutputStream("teachers");
        os = new ObjectOutputStream(f3);
        os.writeObject(teachers);
        os.close();
        f3.close();
    }

    //#### DO NOT CHANGE THIS FUNCTION ####
    public static Object loadData(String name) throws Exception{
        FileInputStream fis = new FileInputStream(name);
        ObjectInputStream ois = new  ObjectInputStream(fis);   
        Object o = ois.readObject();
        ois.close();
        fis.close();
        return o;
    }


}