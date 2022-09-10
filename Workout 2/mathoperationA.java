import java.util.*;
class mathoperation
{
double a;
int x,y;
mathoperation(){
}
void init()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of x");
	x=sc.nextInt();
	System.out.println("Enter the value of y");
	y=sc.nextInt();
}
void add()
{
	int a=x+y;
	System.out.println("The added value is"+a);
}
void multiply()
{
	int a=x*y;
	System.out.println("The multiplied value is"+a);
}
void power()
{ 
	double r=Math.pow(x,y);
	System.out.println("R="+r);
}
void display()
{
	add();
	multiply();
	power();
}
}
class mathoperationA
{
public static void main(String args[])
{
mathoperation a=new mathoperation();
a.init();
a.display();
}
}	
