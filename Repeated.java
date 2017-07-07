import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repeated
{
public static void main(String args[])
{

List<String> repeat = new ArrayList<String>();

String str = "cat bat hat cat mat rat cat hat ";
StringTokenizer itr = new StringTokenizer(str);
String token = null;

while (itr.hasMoreTokens()) 
{
token = itr.nextToken();
repeat.add(token);
}
int[] count= new int[repeat.size()];
for (int i = 0; i < repeat.size(); i++) 
for (int j = 0; j < repeat.size(); j++) 
if(repeat.get(i).equals(repeat.get(j)))
count[i]=count[i]+1;
for (int i = 0; i < repeat.size(); i++) 
if(count[i]<2)
System.out.println(repeat.get(i));
}
}
