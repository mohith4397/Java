import java.io.*;
class Throw {
    int a;
    void display() throws IOException {
        IOException e = new IOException();
        if (a < 18)
            throw e;
        else
            System.out.println("case " + a + " You are a major");
    }
    Throw(int s) {
        a = s;
    }
    public static void main(String[] aa) {
        Throw t = new Throw(11);
        Throw u = new Throw(20);
        Throw v = new Throw(15);
        try {
            t.display();
        } catch (IOException e) {
            System.out.println(e + " case " + t.a + " You are a minor");
        }
        try {
            u.display();
        } catch (IOException e) {
            System.out.println(e + " case " + u.a + " You are a minor");
        }
        try {
            v.display();
        } catch (IOException e) {
            System.out.println(e + " case " + v.a + " You are a minor");
        } finally {
            System.out.print("All Satements Executed");
        }
    }
}