import java.util.*;
class SwapVal
{
int a,b;
SwapVal(){
}
SwapVal(int m,int n)
{
a=m;
b=n;
}
void swap(int a,int b)
{
int c=a;
a=b;
b=c;
}
void swapref(SwapVal val)
{
System.out.println("Before swapping:a="+a+" and b="+b);
int c;
c=val.a;
val.a=val.b;
val.b=c;
System.out.println("After swapping:a="+a+" and b="+b);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int x =sc.nextInt();
int y =sc.nextInt();
SwapVal sv = new SwapVal();
System.out.println("before swapping value of a="+x+" and value of b="+y);
sv.swap(x,y);
System.out.println("after swapping value of a="+x+" and value of b="+y);
SwapVal sv1 = new SwapVal(x,y);
sv1.swapref(sv1);
}
}
