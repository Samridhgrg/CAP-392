import java.util.*;
public class ou{
    Scanner sc=new Scanner(System.in);
    private int sal;
    private String name;
public class in{
    public void i(){
    System.out.println("Enter the name of the employee");
    name=sc.nextLine();
    System.out.println("Enter the salary of the employee");
    sal=sc.nextInt();
    System.out.println("The name of the employee="+name);
    System.out.println("The salary of the employee="+sal);
}
}
public static void main(String[] args)
{
    ou obj=new ou();
    ou.in ob=obj.new in();
    ob.i();
}
}