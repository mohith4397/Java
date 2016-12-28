import java.io.*;
public class Database{
public static void main(String [] args)
{
Manager mgr=new Manager();
Engineer engr=new Engineer();
}
}

class Employee
{
String name,id,ssid;
long int salary;
}
class Manager extends Employee
{
String Department;
}
class Engineer extends Employee
{
String Designation;
}
