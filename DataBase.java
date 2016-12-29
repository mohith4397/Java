import java.io.*;
import java.util.Scanner;
public class DataBase
{
public static void main(String[]args)
{
Execution exe=new Execution();
exe.DataManipulation();
}
}


class Employee {String name,id,ssid;int salary;}
class Manager extends Employee {String Department;}
class Engineer extends Employee {String Designation;}
class Execution {
Scanner reader = new Scanner(System.in);
Engineer engnr=new Engineer();
Manager mgr=new Manager();
void DataManipulation(){
System.out.println("----MENU----");
System.out.println("1.Enter Data");
System.out.println("2.Display Data");
System.out.println("3.Exit");
System.out.println("4.Continue");
int choice=reader.nextInt();
switch (choice)
{
case 1:
	System.out.println("Enter the name");
	mgr.name=reader.next();
	break;
case 2:
	System.out.println("Name: " + mgr.name);
	System.out.println("id: " + mgr.id);
	System.out.println("SSID: " + mgr.ssid);
	System.out.println("Salary of Manager: " + mgr.salary);
	System.out.println("Salary of Engineer: " + engnr.salary);
	break;
case 3:
	System.exit(0);
case 4:
	DataManipulation();
default:
	System.out.println("Invalid choice");
	DataManipulation();
	break;
}
}
}
