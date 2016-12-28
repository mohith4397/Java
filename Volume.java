import java.io.*;
import java.util.Scanner;
public class Volume{
public static void main(String [] args)
{
Scanner reader;
System.out.println("Enter the radius of the cylinder");
float r=0;
r=reader.nextFloat();
System.out.println("Enter the height of the cylinder");
Double h=reader.nextDouble();
System.out.println("Distance is " + (3.142*r*r*h));
}
}
