import java.io.*;
public class Increment{
public static void main(String [] args)
{
values val=new values();
val.operation();
}
}

class values{
void operation()
{
int x=5,y=0,z=0;
y=++x;
z=++y;
++y;
++x;
System.out.println("x=" +x);
System.out.println("y=" +y);
System.out.print("z=" +z);
}
}
