import java.util.*;
class  ha
{
    Scanner sc=new Scanner(System.in);
    int[] salary=new int[3];
    int i;
    void get()
    {
        System.out.println("enter the salary of 3 employees");
        for(i=0;i<3;i++)
        {
        salary[i]=sc.nextInt();
        }
    }
    void cal()
    {
    if(salary[0]==salary[1])
    {
        System.out.println("1 & 2 have the same salary");
    }
    else if(salary[0]==salary[2])
    {
         System.out.println("1 & 3 have the same salary");
    }
    else if(salary[1]==salary[2])
    {
        System.out.println("2 & 3 have the same salary");
    }
    }
}
class as
{
    public static void main(String args[])
    {
    ha obj=new ha();
    obj.get();
    obj.cal();
    }
}
