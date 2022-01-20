 public class Main3 {
        public Main3() {
        }

        public static void main(String[] args) {
            Teacher newTeacher = new Teacher("Paul", "Zaremba", "Computer science 11/12");
            Teacher newTeacher0 = new Teacher("Stephanie", "Thai", "English 10");
            Teacher newTeacher1 = new Teacher("William", "Hodgson", "Social Studies 10");
            Teacher newTeacheradd = new Teacher("Canada", "Canadian", "social 11");
            System.out.println();
            Student newStudent = new Student("Liam", "Smith", 1);
            Student newStudent0 = new Student("Jackson", "Brown", 2);
            Student newStudent1 = new Student("Noah", "Tremblay", 3);
            Student newStudent2 = new Student("Lucas", "Martin", 4);
            Student newStudent3 = new Student("Oliver", "Lee", 5);
            Student newStudent4 = new Student("Grayson", "Tayler", 6);
            Student newStudent5 = new Student("Taisei", "Arima", 7);
            Student newStudent6 = new Student("Tai", "Jones", 8);
            Student newStudent7 = new Student("sei", "Leblec", 9);
            Student newStudent8 = new Student("Tony", "Tony", 10);
            Student newStudentadd = new Student("Mainstin ", "Javastin", 11);
            School b = new School("Uhill", "Secondary", "UBC");
            System.out.println(b);
            System.out.println("");
            b.addTeacher(newTeacher);
            b.addTeacher(newTeacher0);
            b.addTeacher(newTeacher1);
            b.showTeacher();
            System.out.println(" ");
            b.addTeacher(newTeacheradd);
            b.removeTeacher(newTeacher);
            b.showTeacher();
            System.out.println("---------------------------------------");
            System.out.println("original");
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
            b.showStudent();
            System.out.println(" ");
            b.addStudent(newStudentadd);
            b.removeStudent(newStudent);
            b.showStudent();
        }
    }


