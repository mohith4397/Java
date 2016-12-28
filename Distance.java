import java.io.*;
public class Distance{
public static void main(String [] args)
{
values val=new values();
val.s=val.u*val.t + (0.5*val.a*val.t*val.t);
System.out.println("Distance is " + val.s);
}
}
class values{
int u=10,t=5,a=10;
double s;
}
