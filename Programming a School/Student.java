public class Student {
    public String firstname;
    public String lastname;
    public int grade;

    //methods
    public String getFirstname() {return firstname;}
    public void setFirstname(String firstname) {this.firstname = firstname;}
    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}
    public int getGrade() {return grade;}
    public void setGrade(int grade) {this.grade = grade;}
//constructor
    Student(String firstname, String lastname, int grade) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.grade = grade;
    }
//base
    public String toString(){

        return "Name: " + firstname+" " +lastname  + " "  + " grade: " + grade ;
    }
}

