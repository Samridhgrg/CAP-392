import java.util.*;
class employee
{
    Scanner sc=new Scanner(System.in);
    double gs,it,pt,pf,amt;
    void get()
    {
        System.out.print("enter the gross salary:");     
        gs=sc.nextDouble();
        System.out.print("enter the income tax:");
        it=sc.nextDouble();
        System.out.print("enter the professional tax:");
        pt=sc.nextDouble();
        System.out.print("enter the provident fund:");
        pf=sc.nextDouble();
    }
    void cal()
    {
        pf*=(gs/100);
        it*=(gs/100);
        pt*=(gs/100);
        amt=gs-it-pf-pt;
    }
    void dis()
    {
        System.out.print("the net salary is:"+amt);
    }
}
class salary
{
    public static void main(String args[])
    {
        employee obj=new employee();
        obj.get();
        obj.cal();
        obj.dis();
    }
}