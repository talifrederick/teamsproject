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
            System.out.println("7: Search for student");
            System.out.println("8: Exit");
            System.out.println();
            System.out.println("Choice: ");
            ans = sc.nextInt();
            sc.nextLine();

        
            if(ans== 1){
                System.out.println("Enter Student name: ");
                String name = sc.nextLine();
                System.out.println("Enter Grade Level:");
                int gradeLevel = sc.nextInt();
                sc.nextLine();

                Student newStudent = new Student(name, gradeLevel);
                students.add(newStudent);
                
            }
            if(ans==2){
                
                System.out.println("Enter teacher name:");
                String name = sc.nextLine();
                System.out.println("Years of experience: ");
                int years = sc.nextInt();
                sc.nextLine();

                Teacher newTeacher = new Teacher(name, years);
                teachers.add(newTeacher);
                
            }

            if(ans==3){
               
                System.out.println("Enter Subject: ");
                String name = sc.nextLine();
                ArrayList<Teacher>  teachers;
                System.out.println("Pick a Teacher: ");
                Teacher teacherName = sc.nextLine();
                sc.nextLine();

                Course newCourse = new Course(name, teacherName );
                courses.add(newCourse);
                

            }

            if(ans==4){
                ArrayList<Student> students;
                System.out.println("Pick a student: ");
                for(int index =0 ; index < students.size(); index++){
                    students.get(index);
                    if(ans> -1 && ans < students.size()){//how do i check the index to the student
                        System.out.println("1: Modify name");
                        System.out.println("2: Modify grade level");
                        System.out.println("3: Add course");
                        System.out.println("4. Remove Course");

                        if(ans ==1){
                            System.out.println("Enter new name:");
                            
                        }

                        if(ans==2){
                            System.out.println("Enter new grade level:");
                            //ans = 
                        }

                        if(ans ==3){
                            System.out.println("Pick a class");
                            ArrayList<Course> courses;
                            for(int i =0; i < courses.size(); i ++){
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
                
                                    students.add(newCourse);
                            
                                }
                
                            }
                    }    
                        if(ans == 4){
                            ArrayList<Course>  courses;
                            students.getCourses();
                            for( courses in Course){
                                int choice = nextInt();
                                Course c = courses.get(choice);
                                students.removeCourse(c);
                            }

                        }

                    }
              

                    
                
                        
                        


                
        

            }

            if(ans == 5){
                for(int index =0 ; index < students.size(); index++){
                    System.out.println(students);
                }
                

            }

            if(ans==6){ // how do i print toString after 
                for(int index =0 ; index < courses.size(); index++){
                    System.out.println(courses);
                } 

            }

            if(ans ==7){
                System.out.println("Enter student name:");
                for(int index =0 ; index < students.size(); index++){
                    students.get(index);
                    if(ans == students.index); //how do i check the index
                }

                
            }

            if(ans==8){
                
            }

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
// remove course in edit student option
    /* ArrayList<Course>  courses student.getCourses();
    *print("Which course");
     * for( courses)
     * }
     * int choice = nextInt()]
     * Course c = courses.get(choice);
     * student.removeCourse(c);
     */


}