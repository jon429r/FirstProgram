import java.util.Scanner;
import java.util.ArrayList;

public class App{

private int numStudents = 0;

    public static ArrayList<Student> dataBase = new ArrayList<>(); 

    public static void main(String args[]){

        Scanner sc = new Scanner("Student.txt");

        while(sc.hasNextLine()){
            numStudents++;
            Student student = new Student();
            std1.setfirstName(sc.nextLine());
            std1.setlastName(sc.nextLine());
            std1.setidNumber(numStudents);
            std1.setyear(Integer.parseInt(sc.nextLine()));
            dataBase.add(std1);
        }
    }

    public static void addStudent(){
        System.out.println("First Name:");
                System.out.println("Last Name:");
                        System.out.println("First Name:");


    }
}