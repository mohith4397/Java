public class Palindrome
{
boolean pal(String a)
{
for(int i=0;i<a.length();i++)
if(a.charAt(i)!=a.charAt(a.length()-1-i))
return false;
return true;
}
public static void main(String args[])
{
Palindrome obj=new Palindrome();
System.out.print(obj.pal("malayalam"));
}
}
