public class Student {

    String firstName;
    String lastName;
    int idNumber;
    int year;

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

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public void setidNumber(int idNumber){
        this.idNumber = idNumber;
    }
    public void setyear(int year){
        this.year = year;
    }

    public String toString(){
        return "Name: " + firstName + " " + lastName + " idNumber: " + idNumber + " year: " + year;
    }
}
