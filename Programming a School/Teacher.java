public class Teacher {
    //fields
    public String firstname;
    public String lastname;
    public String subject;
    public String name;


    //methods
    public String getFirstname() {return firstname;}
    public void setFirstname(String firstname) {this.firstname = firstname;}
    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}
    public String getSubject() {return subject;}
    public void setSubject(String subject) {this.subject = subject;}
    public String getName() {return firstname + lastname;}
    public void setName(String name) {this.name = name;}

    Teacher() {
        firstname = "Taisei";
        lastname = "Arima";
        subject = "math 9";
        name = "dd";
    }
//constructor
    Teacher(String firstname, String lastname, String subject) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.subject = subject;
    }
//base
        public String toString(){

            return "Name: " + firstname+" " +lastname  + " "  + " subject: " + subject ;
        }
    }

