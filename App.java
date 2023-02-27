import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class App{

public static int numStudents = 0;

    public static ArrayList<Student> dataBase = new ArrayList<>(); 

    public static void main(String args[]) throws FileNotFoundException{
        filldataBase();
        menu();
    }
    public static void menu(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the student home page what would you like to do? \nBecome a student \nEnroll in a course \ncheck your grades");
        String input = scnr.next();
        if(input.equalsIgnoreCase("Become A Student")){
            addStudent();
        }
       if(input.equalsIgnoreCase("Enroll in a course")){
            Enroll();
       }
       if(input.equalsIgnoreCase("Check your grades")){
            ReportCard();
       }
    }

    public static void Enroll(){
        System.out.println("Not a feature yet you filthy animal!");
    }

    public static void ReportCard(){
        System.out.println("Not a feature yet you filthy animal!");
    }

    public static ArrayList<Student> filldataBase() throws FileNotFoundException{
        File file = new File("Student.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            numStudents++;
            Student student = new Student();
            student.setfirstName(sc.nextLine());
            student.setlastName(sc.nextLine());
            student.setidNumber(numStudents);
            student.setyear(1);
            dataBase.add(student);
        }
        sc.close();
        return dataBase;
    }

    public static void printdataBase(){
        for (int index = 0; index < dataBase.size(); index++) {
            System.out.println(dataBase.get(index));
        }
    }

    public static void addStudent(){
        Scanner scnr = new Scanner(System.in);
        Student student = new Student();
        numStudents++;

        System.out.println("First Name:");
        student.setfirstName(scnr.next());
                System.out.println("Last Name:");
                student.setlastName(scnr.next());
                        student.setidNumber(numStudents);
                            student.setyear(1);
                            scnr.close();
    }
}
