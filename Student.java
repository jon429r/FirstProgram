public class Student {

    String firstName;
    String lastName;
    int idNumber;
    int year;
    double gpa;

    public String getfirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public int getidNumber(){
        return idNumber;
    }
    public int getyear() {
        return year;
    }
    public double getgpa(){
        return gpa;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public void setidNumber(int idNumber){
        if(App.numStudents < 100000){
            this.idNumber = idNumber + 100000;
        }
        else{
            this.idNumber = idNumber + 200000;
        }
    }
    public void setyear(int year){
        this.year = year;
    }
    public void setgpa(double gpa){
        this.gpa = gpa;
        }
    

    public String toString(){
        return "Name: " + firstName + " " + lastName + " idNumber: " + idNumber + " year: " + year;
    }
}
