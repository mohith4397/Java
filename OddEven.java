import java.util.*;
import java.io.*;
 class OddEven
{
int i;
OddEven(int i) {this.i=i;}
void display(){
    if(i%2==0)
   System.out.println(i + " is even.");
    else
    System.out.println(i + " is odd.");
    
}
public static void main(String []m)
{
OddEven oe1=new OddEven(32767);
OddEven oe2=new OddEven(-32766);
oe1.display();
oe2.display();
}

}
