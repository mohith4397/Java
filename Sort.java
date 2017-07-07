import java.util.Scanner;
public class Sort
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of array");
int n=s.nextInt();
int[] a= new int[n];
System.out.println("Enter the array");

for(int i=0;i<n;i++)
a[i]=s.nextInt();

int temp=0;
System.out.println("Ascending");

for(int i=0;i<n;i++)
for(int j=0;j<n;j++)
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}

for(int i=0;i<n;i++)
System.out.print(a[i]+" ");


System.out.println("\nDescending");

for(int i=0;i<n;i++)
for(int j=0;j<n;j++)
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}

for(int i=0;i<n;i++)
System.out.print(a[i]+ " ");





}
}