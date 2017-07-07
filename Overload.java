public class Overload
{
static void add(int a,int b)
{
System.out.println(a+b);
}
static void add(int a,int b,int c)
{
System.out.println(a+b+c);
}
public static void main(String args[])
{
add(3,4);
add(3,4,5);
}
}