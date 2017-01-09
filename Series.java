import java.util.*;
import java.io.*;
 class Series
{
void display()
{ 
int k=0;
for(int i=1;i<5;i++)
    {
for( int j=0;j<i;j++)
{      
System.out.print(" " +(++k));
} 
     System.out.print("\n");
    }

}
public static void main(String []m)
{
Series mohi=new Series();
mohi.display();
}

}                                                                                                                 
