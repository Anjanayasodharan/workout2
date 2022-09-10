class rectangle
{
	double length,breadth;
	rectangle(double x)
	{
		length=x;
		breadth=x;
	}
	rectangle(double a,double b)
	{
		length=a;
		breadth=b;
	}
void getArea()
{
	double area=length*breadth;
	System.out.println("Area of rectangle="+area);
}
void getParameter()
{
	double perimeter=2*(length*breadth);
	System.out.println("Perimeter of rectangle="+perimeter);
}
 
public static void main(String[] args)
{
	rectangle r1=new rectangle(20);
	rectangle r2=new rectangle(30,10);
	r1.getArea();
	r1.getParameter();
	r2.getArea();
	r2.getParameter();
}
}