import java.util.*;
class student
{
Scanner sc=new Scanner(System.in);
String name ;
int total,i;
int ca[]=new int[3];
int max=0;
	int max2=0;
void get()
{
	System.out.println("enter the name of the student");
	name=sc.nextLine();
	System.out.println("enter the marks of 3 ca's");
	for(int i=0;i<3;i++)
	{
	ca[i]=sc.nextInt();
	}
}
void calculate()
{
	if(ca[0]>ca[1]&&ca[0]>ca[2])
	{
		System.out.println(ca[0]+"is the highest number");
		max=ca[0];
	}
	else if(ca[1]>ca[0]&&ca[1]>ca[2])
	{
		System.out.println(ca[1]+"is the highest number");
		max=ca[1];
	}
	else 
	{
		max=ca[2];
	}
	for(i=0;i<3;i++)
	{
		if(ca[i]>ca[i+1]&&ca[i]<max)
		max2=ca[i];
	
	}
	total=total+max+max2;
	
}
void print ()
{
System.out.println("the name of the student is:"+name);
System.out.println("the total is:"+total);
System.out.println("the highest marks are:"+max);
System.out.println("the second highest are:"+max2);
}
}
class demo
{
public static void main(String args[])
{
student []obj=new student[3];
obj.get();
obj.calculate();
obj.print();
}	
}