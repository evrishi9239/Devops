import java.util.*;
public class Even
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
for(int i=0;i<=9;i++)
{
System.out.println("Ten numbers are");
a[i]=sc.nextInt();
if(a[i]%2==0)
{
System.out.println("True");
}
else
{
System.out.println("False");
}
}}}



