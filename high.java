import java.util.*;
class ma
{
    Scanner sc=new Scanner(System.in);
    int amount,year,n;
    String course;
    void data()
    {
        System.out.println("enter the course");
        System.out.println("enter 1 for BA");
        System.out.println("enter 2 for BCA");
        System.out.println("enter 3 for BBA");
        n=sc.nextInt();
    }
}
class ba extends ma
{
    void one()
    {
 if(n==1)
 {
    System.out.println("COURSE NAME = BACHOLERS IN ARTS");
    System.out.println("AMOUNT = 100000");
 }
 else
 {
     System.out.println(" ");
 }
}
}
class bca extends ma
{
    void two()
    {
    if(n==2)
 {
    System.out.println("COURSE NAME = BACHOLERS IN COMPUTERS APPLICATION");
    System.out.println("AMOUNT = 100000");
 }
 else
 {
     System.out.println(" ");
 }
}
}
class bba extends ma
{
    void three()
    {
if(n==3)
 {
    System.out.println("COURSE NAME = BACHOLERS IN BUSSINESS");
    System.out.println("AMOUNT = 80000");
 }
 else
 {
     System.out.println(" ");
 }
}
}
class high
{
public static void main(String Args[])
{
ba o=new ba();    
bca ob=new bca();
bba obj=new bba();
o.one();
ob.two();
obj.three();
}
}
