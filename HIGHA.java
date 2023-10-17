import java.util.*;
class HIGHA {
    Scanner sc=new Scanner(System.in);
    String name;
    int sal,comm;
    void put()
    {
        System.out.println("enter the name of the Employee");
        name=sc.nextLine();
        System.out.println("enter the salary of the Employee");
        sal=sc.nextInt();
        System.out.println("enter the commision");
        comm=sc.nextInt();
    }
}
    class sup extends HIGHA
    {
        void cal()
        {
            if(sal<=50000)
            {
                System.out.println("gud");
            }
            else
            {
                System.out.println("not gud");
            }
        }
    }
    class sep extends HIGHA
    {
        void display()
        {
            System.out.println("the name of the employee is"+name);
            System.out.println("the salary of the employee is"+sal);
            System.out.println("the commision of the employee is"+comm);
        }
    }
    class emp
    {
        public static void main(String args[])
        {
            HIGHA obj=new HIGHA();
            sup obj1=new sup();
            sep obj2=new sep();
            obj.put();
            obj1.cal();
            obj2.display();
        }
    }
