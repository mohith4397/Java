import java.util.*;
import java.lang.String;
class Salary
{ static int salary=1000,price,quantity;String name;

Salary(int price,int quantity,String name )
{
    this.price=price;
    this.quantity=quantity;
    this.name=name;
}
void calculation()
{
    int amount=price*quantity;
    int percentage=(salary-amount)*100/salary;
    System.out.println("Name= "+name +"\n"+ 
                        "Salary= "+salary +"\n"+ 
                        "Price= "+price +"\n"+ 
                        "Quantity= "+quantity +"\n"+ 
                        "Percentage= "+percentage);
}
public static void main(String[] args)
{
    Salary sal=new Salary(10,10,"Mohith");
    sal.calculation();
}
}