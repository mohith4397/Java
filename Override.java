public class Override
{
public static void main(String args[])
{
Parent P=new Parent();
P.display();

Child2 obj=new Child2();
obj.display();

Child C=new Child();
C.display();
}

}


class Parent
{
void display(){System.out.println("Parent");}
}
class Child extends Parent
{
void display(){System.out.println("Child");}
}
class Child2 extends Parent
{

}