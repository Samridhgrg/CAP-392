import java.util.*;
class palindrom
{
public static void main(String args[])
{
int n,rev=0,r,s;
Scanner sc=new Scanner(System.in);
System.out.print("enter the number to be reversed  : ");
n=sc.nextInt();
s=n;
while(n>0)
{
r=n%10;
rev=rev*10+r;
n=n/10;
}
if(s==rev)
{
System.out.print("the number is a palindrom");
}
else
{
System.out.print("the number is not a palindrom");
}
}
}