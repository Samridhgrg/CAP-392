import java.util.*;
class student
{
    Scanner sc = new Scanner (System.in);
    int[] marks=new int[100];
    int roll,i,n,sum;
    String name;
    void one()
    {
        System.out.println("enter the name of the student:");
        name=sc.nextLine();
        System.out.println("enter the roll number:");
        roll=sc.nextInt();
        System.out.println("enter the number of subjects");
        n=sc.nextInt();
        System.out.println("enter the marks:");
        for(i=0;i<n;i++)
        {
            marks[i]=sc.nextInt();
            sum=sum+marks[i];
        }
    }
}
    class result extends student
    {
        void two()
        {
            int avg;
        System.out.println("the name of the student is="+name);
        System.out.println("the roll number of the student is="+roll);
        avg=(sum/n);
        System.out.println("the average is="+avg);
    }
    }
class heha
{
public static void main(String Args[])
{
result obj=new result();
obj.one();
obj.two();
}

}
