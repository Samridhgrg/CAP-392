import java.util.*;
class reverse
{
public static void main(String args[])
{
int n,rev=0,r;
Scanner input=new Scanner(System.in);
System.out.print("enter the number to be reversed  : ");
n=input.nextInt();
while(n>0)
{
r=n%10;
rev=rev*10+r;
n=n/10;
}
System.out.print("the reverse is:"+rev);
}
}