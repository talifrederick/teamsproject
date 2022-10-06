import java.io.Serializable;


public class Teacher implements Serializable {
    private String name;
    private int years;
    

    public Teacher( String name, int years){
        this.name = name;
        this.years = years;

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

    public String toString(){
        return( name);
    }




}
