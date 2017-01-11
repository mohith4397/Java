import java.util.Scanner;
class Exception_Try_Catch {
int d, a;
void calc()
{
Scanner read=new Scanner(System.in);
try {
d = 0;
a = 4397/ d;
} catch (ArithmeticException e) 
{ 
System.out.println("Division by zero error");
System.out.println("Enter a non zero integer");
d=read.nextInt();
try{a=4397/d;}catch (ArithmeticException f) 
{ 
calc();
}
}

}
public static void main(String args[]) {
Exception_Try_Catch ex =new Exception_Try_Catch();
ex.calc();
System.out.println("Answer is "+ ex.a);
}
}
