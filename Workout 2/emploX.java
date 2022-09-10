import java.util.*;
class emplo{
static int empno;
static double salary,totalsalary;
emplo(double salary)
{
empno++;
System.out.println("employee number="+empno);
this.salary=salary;
System.out.println("salary="+salary);
totalsalary=salary+totalsalary;
}
static void disp()
{
System.out.println("Total number of employee="+empno);
System.out.println("Total salary of all employee="+totalsalary);
}
}
class emploX
{
public static void main(String args[])
{
float a1,a2,a3,a4;
Scanner s=new Scanner(System.in);
System.out.println("enter the first employee salary");
a1=s.nextFloat();
emplo e1=new emplo(a1);
System.out.println("enter the second employee salary");
a2=s.nextFloat();
emplo e2=new emplo(a2);
System.out.println("enter the third employee salary");
a3=s.nextFloat();
emplo e3=new emplo(a3);
System.out.println("enter the fourth employee salary");
a4=s.nextFloat();
emplo e4=new emplo(a4);
emplo.disp();
}
}

