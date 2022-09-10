import java.util.*;
class mathFunction
{
float z;
void multiply(int a,int b)
{
z=a*b;
System.out.println("z="+z);
}
void multiply(float a,float b)
{
z=a*b;
System.out.println("z="+z);
}
void multiply(int a,float b)
{
z=a*b;
System.out.println("z="+z);
}
}
class mathFunctionA
{
public static void main(String args[])
{
mathFunction f=new mathFunction();
f.multiply(4,5);
f.multiply((float)7.1,(float)8.3);
f.multiply(4,(float)3.2);
}
}