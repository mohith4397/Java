import java.util.Scanner;
import java.io.*;
class Exam {
    int[] rating = new int[5];
    String[] name = new String[5];
    Scanner s = new Scanner(System.in);
    int counter=0;
    void accept() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Exam Details");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Exam " + (i + 1) + " Marks");
            rating[i] = s.nextInt();
            counter=counter+rating[i];
        }
    }
    void display() {
        int percentage=counter/5;
        System.out.println("Percentage = " +percentage);
        if(percentage>=85 && percentage<=100)
        System.out.println("Grade= A+");
        if(percentage>=75 && percentage<=84)
        System.out.println("Grade= A");
        if(percentage>=65 && percentage<=74)
       System.out.println("Grade= B");
        if(percentage>=50 && percentage<=64)
       System.out.println("Grade= C");
        if(percentage<50)
       System.out.println("Failed");
    }
    
    public static void main(String[] args) {
        Exam st = new Exam();
        st.accept();
        st.display();
    }
}