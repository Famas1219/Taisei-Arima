public class Emplyee {
//private (-)
   private int idNum;
    private String firstname;
    private String lastname;
     private int salary;
//public (+)

   // construction
    Emplyee(int idNum,String firstname, String lastname, int salary){
        this.firstname = firstname;
        this.lastname = lastname;
        this.idNum = modelnumber;
        this.salary = salary;
        modelnumber++;
    }
    //construction

static int modelnumber = 1;
    Emplyee() {
        firstname = "Taisei";
        lastname = "Arima";
        salary = 50;
        idNum = modelnumber;
        modelnumber++;
    }
    //setter and getter
    public int getIdNum() {return idNum;}
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getName() {return firstname + " " + lastname;}
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualsalary(){return salary * 12;
    }
    public int raiseSalary (int percent){
        return  salary * (1 + percent/100);
   }

public String toString(){
        return "  IdNum:  " + idNum +  "  name: " + getName() + "  salary: " + getSalary();
    }

    }




