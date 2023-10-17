import java.util.*;
class da
{
    Scanner sc=new Scanner(System.in);
    String name;
    int id,x,sum;
    void sa()
    {
        System.out.print("enter the name:");
        name=sc.nextLine();
        System.out.print("enter the id:");
        id=sc.nextInt();
        System.out.print("enter the bill:");
        x=sc.nextInt();
    }
    void fa()
    {
        if(x<=100)
        {
            sum=(x*2);
        }
        else if(x>100&&x<200)
        {
           sum=(100*2+(x-100)*3);
        }
        else
        {
            sum=(100*2+100*3+(x-200)*4));
        }
    }
}
    class devo
    {
        public static void main(String args[])
        {
            da obj=new da();
			obj.sa();
			double bill=obj.fa();
			System.out.println("bill:"+bill);
        }
    }