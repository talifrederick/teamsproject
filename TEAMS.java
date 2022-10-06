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
                String subject = sc.nextLine();
                System.out.println("Pick a Teacher: ");
                for(int i=0; i<teachers.size();i++){
                    System.out.println(i+" "+teachers.get(i));
                }
                int choice = sc.nextInt();
                sc.nextLine();
                Teacher t = teachers.get(choice);


                Course newCourse = new Course(subject, t);
                courses.add(newCourse);
                

            }

            if(ans==4){
     
                System.out.println("Pick a student: ");
                for(int index =0 ; index < students.size(); index++){
                    System.out.print(index+ " "+ students.get(index));
                }
                System.out.println("choice:");
                int schoice =sc.nextInt();
                Student student = students.get(schoice);

                
                    if(schoice> -1 && schoice < students.size()){
                        System.out.println("1: Modify name");
                        System.out.println("2: Modify grade level");
                        System.out.println("3: Add course");
                        System.out.println("4. Remove Course");

                        if(ans ==1){
                            System.out.println("Enter new name");
                            String name = sc.nextLine();
                            student.setName(name);
                            
                        }

                        if(ans==2){
                            System.out.println("Enter new grade level:");
                            int gradeLevel = sc.nextInt();
                            student.setGradeLevel(gradeLevel);

                        }

                        if(ans ==3){
                            System.out.println("Pick a class");
                            ArrayList<Course> courses = student.getCourses();
                            for(int i =0; i < courses.size(); i ++){
                                System.out.println(i +" "+ courses.get(i));
                            }
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
                                        c.setCurrent(true);
                                    }
                
                                    student.addCourse(c);
                            
                                }
                
                            
                    }    
                        if(ans == 4){
                            ArrayList<Course>  courses;
                            courses = student.getCourses();
                            int i =0;
                            for(Course c: courses){
                                System.out.println(i +" "+courses);
                                i++;
                            }
                            System.out.println("Choice:");
                            ans = sc.nextInt();
                            sc.nextLine();
                            student.removeCourse(courses.get(ans));



                        }

                    }
              

                    
                
                        
                        


                
        

            }

            if(ans == 5){
                for(int index =0 ; index < students.size(); index++){
                    System.out.println(index+ " " +students.get(index));
                }
                

            }

            if(ans==6){ 
                for(int index =0 ; index < courses.size(); index++){
                    System.out.println(index+" "+courses.get(index));
                } 

            }

            if(ans ==7){
                System.out.println("Enter student name:");
                String search = sc.nextLine();
                for(int index =0 ; index < students.size(); index++){
                    Student s = students.get(index);
                    if(s.getName().equals(search)){
                        System.out.println(s.getName());

                    } 
                    else{
                        System.out.println("student does not exist");
                    }
                }

                
            }

            if(ans==8){
                try{

                    saveData();
                    
                    }catch(Exception e){}
                
            }

        }
        

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