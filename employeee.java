import java.util.*;
public class employeee{
    Scanner sc=new Scanner(System.in);
    private int sal;
    private String name;
public class bonus{
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
    employeee obj=new employeee();
    employeee.bonus ob=obj.new bonus();
    ob.i();
}
}