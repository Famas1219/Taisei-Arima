public class Main {
    public static void main(String[] args) {
//Teacher
Teacher newTeacher = new Teacher("Paul","Zaremba","Computer science 11/12");
Teacher newTeacher0 = new Teacher("Stephanie","Thai","English 10");
Teacher newTeacher1 = new Teacher("William","Hodgson","Social Studies 10");

//add
Teacher newTeacheradd = new Teacher("Canada","Canadian","social 11");

System.out.println();
//Student
Student newStudent = new Student("Liam","Smith",1);
Student newStudent0 = new Student("Jackson","Brown",2);
Student newStudent1 = new Student("Noah","Tremblay",3);
Student newStudent2 = new Student("Lucas","Martin",4);
Student newStudent3 = new Student("Oliver","Lee",5);
Student newStudent4 = new Student("Grayson","Tayler",6);
Student newStudent5 = new Student("Taisei","Arima",7);
Student newStudent6 = new Student("Tai","Jones",8);
Student newStudent7 = new Student("sei","Leblec",9);
Student newStudent8 = new Student("Tony","Tony",10);

//add
Student newStudentadd = new Student("Mainstin ","Javastin",11);

//School
School b = new School("Uhill","Secondary","UBC");

System.out.println(b);
System.out.println("");

//Teacher array
b.addTeacher(newTeacher);
b.addTeacher(newTeacher0);
b.addTeacher(newTeacher1);

// original arraylist Teacher
b.showTeacher();

//separate
System.out.println(" ");

//add teacher
b.addTeacher(newTeacheradd);
//delete teacher
b.removeTeacher(newTeacher);
//array list with adding and moving
b.showTeacher();

//separate
System.out.println("---------------------------------------");

//Student array
b.addStudent(newStudent);
b.addStudent(newStudent0);
b.addStudent(newStudent1);
b.addStudent(newStudent2);
b.addStudent(newStudent3);
b.addStudent(newStudent4);
b.addStudent(newStudent5);
b.addStudent(newStudent6);
b.addStudent(newStudent7);
b.addStudent(newStudent8);

//original list
b.showStudent();

//separate
System.out.println(" ");

//add Student
b.addStudent(newStudentadd);
//delete Student
b.removeStudent(newStudent);
//new list
b.showStudent();





/*
System.out.println((newTeacher));
//add student
b.addStudent(newStudent);
System.out.println(newStudent);



System.out.println("  ");

//remove teacher

System.out.println(newTeacher);
b.removeStudent(newTeacher);
System.out.println(newStudent);

//remove student



 */

    }
}
