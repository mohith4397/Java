import java.io.*;
import java.util.Scanner;
public class Employee
{
Scanner s=new Scanner(System.in);
String id;
String name;
void enterdata()
{
id=s.next();
name=s.next();
}
void display()
{
System.out.println(id + "\n" + name);
}
void switchcase()
{
switch (choice)
{
case 1:
e.enterdata();
break;
case 2:
e.display();
break;
case 3:
System.exit(0);
}

}


public static void main(String [] args)
{
Employee e=new Employee();
Scanner s=new Scanner(System.in);
int choice=1;
e.switchcase();
}






}
}
