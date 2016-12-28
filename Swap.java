import java.io.*;
public class Swap{
public static void main(String [] args)
{
Implementswap Imp=new Implementswap();
Imp.operation();
Imp.NOtemp();
}
}

class Implementswap{
void operation()
{
System.out.println("Swapping using temporary variable.\n");
int x=5,y=10,temp=0;
temp=x;
x=y;
y=temp;
System.out.println("x= " + x + "\ny= " + y);
}
void NOtemp()
{
System.out.println("Swapping without temporary variable.\n");
int x=5,y=10;
x=x*y;
y=x/y;
x=x/y;
System.out.println("x= " + x + "\ny= " + y);
}
}