import java.util.Scanner;

class Student{
    String FStudent;
    String LStudent;
    int Age ;
    int Grades[]= new int[4];

    public Student(){
        this.FStudent = " ";
        this.LStudent = " ";
        this.Age = 0;
        this.Grades = new int[4];

    }

    public Student(String FStudent, String LStudent, int Age, int Grades[]) {
        this.FStudent = FStudent;
        this.LStudent = LStudent;
        this.Age = Age;
        this.Grades = Grades;

    }

    public void Show(){
        System.out.println("First name: " + FStudent + "\nLast name: " +
                        LStudent+ "\nAge: " + Age+"\nGrades: ");

        for(int i=0; i<4; i++) {
            System.out.print(Grades[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        Student student = new Student();
        System.out.println("First name: ");
        student.FStudent = scanner.nextLine();
        System.out.println("Last name: " );
        student.LStudent = scanner.nextLine();
        System.out.println("Age: ");
        student.Age = scanner.nextInt();
        for (int i = 0; i < 4; i++) {
            System.out.println("enter the grade "+i);
            student.Grades[i]= scanner.nextInt();
        }



        student.Show();

        /**
        Scanner scanner= new Scanner (System.in);
        System.out.println("Hello world!");
        System.out.print("Type your name: ");
        String name= scanner.nextLine();
        System.out.print("Hiiiiii!!!!   " + name);
        **/

    }
}