import java.util.Scanner;
import java.io.*;
class Student {
    int[] age = new int[5];
    String[] name = new String[5];
    Scanner s = new Scanner(System.in);
    void accept() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Student Details");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Student " + (i + 1) + " Age");
            age[i] = s.nextInt();
            System.out.println("Enter Student " + (i+1) + " Name");
            name[i] = s.next();
        }
    }
    void display() {
        Scanner s = new Scanner(System.in);
        System.out.println("Student Details");
        for (int i = 0; i < 5; i++)
            System.out.println("Student " + (i + 1) + " Name: " + name[i] + " Age: " + age[i]);
    }
    
    public static void main(String[] args) {
        Student st = new Student();
        st.accept();
        st.display();
    }
}
