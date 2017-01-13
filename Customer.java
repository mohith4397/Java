import java.util.Scanner;
import java.io.*;
class Customer {
    int[] rating = new int[5];
    String[] name = new String[5];
    Scanner s = new Scanner(System.in);
    int counter=0;
    void accept() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Customer Details");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Customer " + (i+1) + " Name");
            name[i] = s.next();
            System.out.println("Enter Customer " + (i + 1) + " Rating");
            rating[i] = s.nextInt();
            counter=counter+rating[i];
        }
    }
    void display() {
        System.out.println("Average Rating= " +(counter/5));
        
    }
    
    public static void main(String[] args) {
        Customer st = new Customer();
        st.accept();
        st.display();
    }
}