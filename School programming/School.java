import java.util.ArrayList;
//fields
public class School {
    public String name;
    public String grade;
    public String region;
//methods
    /**methods
     *
     */
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getGrade() {return grade;}
    public void setGrade(String grade) {this.grade = grade;}
    public String getRegion() {return region;}
    public void setRegion(String region) {this.region = region;}
//constructer
    /**constructor
     *
     * @param name
     * @param grade
     * @param region
     */
  School(String name, String grade, String region) {
        this.name = name;
        this.grade = grade;
        this.region = region;
    }

    public String toString(){
        return "Name: " + name  +  "  grade: " + grade  + "  Region: " + region;
    }
//methods
    /**methods
     *
     */

        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
//methods for add and remove Teacher

    /**
     *
     * @param newTeacher
     */
    public void addTeacher(Teacher newTeacher){teachers.add(newTeacher);}
    public void removeTeacher(Teacher newTeacher){teachers.remove(0);}
//array list

    /**
     * array list
     */
    public void showTeacher(){
        for (int i = 0; i <teachers.size(); i ++){
            System.out.println(teachers.get(i));
        }
    }

    ArrayList<Student> student = new ArrayList<>();

    //methods for add and remove Student


    /**
     *
     * @param newStudent
     */
    public void addStudent(Student newStudent){student.add(newStudent);}
    public void removeStudent(Student newStudent){student.remove(0);}

//Array list


    public void showStudent(){
        for (int i = 0; i <student.size(); i ++){
            System.out.println(student.get(i));
        }
    }
}

