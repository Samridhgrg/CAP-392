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
        System.out.print("enter the amount:");
        x=sc.nextInt();
    }
    int fa()
    {
        if(x<=100)
        {
              System.out.print(sum=(x*2));
        }
        else if(x<=200)
        {
             System.out.print(sum=(100*2+(x-100)*3));
        }
        else
        {
              System.out.print(sum=(100*2+100*3+(x-200)*4));
        }
    }
}
 
	   class devo
    {
        public static void main(String args[])
        {
            da obj=new da();
			obj.sa();
			obj.fa();
        }
    }