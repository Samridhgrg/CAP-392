import java.util.*;
class array
{
public static void main(String args[])
{
int[] arr=new int[5];
int i,n,total=0,avg=0,j;
Scanner input=new Scanner(System.in);
System.out.println("enter the marks");
for(i=0;i<5;i++)
{
	arr[i]=input.nextInt();
}
	for(j=0;j<5;j++)
	{
		total=total+arr[j];
	}
	System.out.println("the total is:"+total);
	avg=total/5;
	System.out.println("the avg is:"+avg); 
}
}