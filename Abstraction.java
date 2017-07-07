public abstract class Abstraction
{
public abstract void number();
public static void main(String args[])
{
child c =new child();
c.number();
}
}

class child extends Abstraction
{
public void number(){System.out.println(5);}
}