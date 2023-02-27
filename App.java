import java.util.Scanner;
import java.util.ArrayList;

public class App{

    public static ArrayList<Student> dataBase = new ArrayList<>(); 

    public static void main(String args[]){

        Scanner sc = new Scanner("Student.txt");

        while(sc.hasNextLine()){
            Student std1 = new Student();
            std1.setfirstName(sc.nextLine());
            std1.setlastName(sc.nextLine());
            std1.setidNumber(Integer.parseInt(sc.nextLine()));
            std1.setyear(Integer.parseInt(sc.nextLine()));
            dataBase.add(std1);
        }
    }
}