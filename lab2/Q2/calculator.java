class calculator
{
public static void main(String args[])
{	double a,b;
	a= Double.parseDouble(args[0]);
	b= Double.parseDouble(args[2]);
	char op= args[1].charAt(0);
	
	if(op=='+')
	{
		System.out.println("Result is: "+(a+b));
	}
	if(op=='-')
	{
		System.out.println("Result is: "+(a-b));
	}
	if(op=='x')
	{
		System.out.println("Result is: "+(a*b));
	}
	if(op=='/')
	{
		System.out.println("Result is: "+(a/b));
	}
}	
}
