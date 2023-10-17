import java.util.*;
class rect
{
    int length;
    int breath;
rect(int l,int b)
    {
        length=l;
        breath=b;
    }
}
int area()
{
int a;
a=length*breath;
return a;
}
class Rectangle
{
    public static void main(String args[])
    {
        rect obj=new rect(10,20);
        int result=obj.area();
        System.out.print("the result is:"+result);
    }
}